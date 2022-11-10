package Hangman;
import java.util.Scanner;
import java.io.File;
public class Board{
  // gets the random unknown phrase 
  String phrase = loadPhrase();
  boolean finished = false;
  // list of all different letters in the phrase separated by spaces
  String letters = "";
  String lettersGuessed = "";
  String phraseBlanks = phrase;
  
  // how many of the letter guessed is in the phrase
  int numLetters;
  Scanner sc = new Scanner(System.in);
  
  
  public Board(){
    for (int i = 0; i < phrase.length(); i++){
      String letter = phrase.substring(i, i + 1);
    
      // adds letter to the list of all different letters
      if (letters.indexOf(letter) == -1)
        letters = letters + " " + letter;
      
      // replaces letters with _
      if (!letter.equals(" "))
        phraseBlanks = phraseBlanks.replace(letter, "_");
    }
  }
  
  public void printBoard(){
    System.out.println(phraseBlanks);
  }

  public void initiateGame(){
    System.out.println("\033[H\033[2J");
    System.out.println(phraseBlanks);
    System.out.println("Guess the letter or the phrase!");
    while (finished == false){
      makeGuess(getInput());

      //score 
      
      if (phraseBlanks.equals(phrase)){
        finished = true;
      }
    }
    System.out.println("Congratulations, you got it!");
  }

  // gets the input for 
  public String getInput(){
    String input = sc.nextLine();
    while (input.length() != 1){
      if (input.equals(phrase)){
        System.out.println("Wow! you guessed it!");
        System.exit(0);
      } else {
        System.out.println("Please input a letter!");
        input = sc.nextLine();
      }
    }
    return input;
  }

  // makes a single guess for a letter
  public void makeGuess(String guess){
    String tempString = phrase;
    System.out.println("\033[H\033[2J");
    int charLocation = phrase.indexOf(guess);
    if (lettersGuessed.indexOf(guess) != -1){
      System.out.println("You already guessed this!");
    } else if (charLocation == -1){
      System.out.println("Nope, that letter isn't in the phrase.");
      lettersGuessed += guess + " ";
    } else {
      System.out.println("Yep, that letter is in the phrase.");
      numLetters = 0;
      lettersGuessed += guess + " ";
      while (charLocation != -1){
        charLocation += phrase.length() - tempString.length();
        phraseBlanks = phraseBlanks.substring(0, charLocation) + guess + phraseBlanks.substring(charLocation + 1);
        tempString = phrase.substring(charLocation + 1);
        numLetters += 1;
        charLocation = tempString.indexOf(guess);
      }
    }
    printBoard();
    System.out.println("\nLetters guessed:" + lettersGuessed);
  }

  private static String loadPhrase()
    {
      String tempPhrase = "";
      
      int numOfLines = 0;
      tempPhrase = "how are you";
      
      try 
      {
        
        Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/testing1234/Hangman/phrases.txt"));
        while (sc.hasNextLine())
        {
          tempPhrase = sc.nextLine().trim();
          numOfLines++;
        }
      } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
      
      int randomInt = (int) ((Math.random() * numOfLines) + 1);
      
      try 
      {
        int count = 0;
        Scanner sc = new Scanner(new File(/*Replace with the path*/"/workspace/testing1234/Hangman/phrases.txt"));
        while (sc.hasNextLine())
        {
          count++;
          String temp = sc.nextLine().trim();
          if (count == randomInt)
          {
            tempPhrase = temp;
          }
        }
      } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }

      return tempPhrase;
    }
}
