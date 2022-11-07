package Hangman;
import java.util.Scanner;
import java.io.File;
public class Board{
  static String phrase = loadPhrase();
  // list of all different letters in the phrase separated by spaces
  static String letters = "";
  static String phraseBlanks = phrase;
  
  for (int i = 0; i < phrase.length(); i++){
    String letter = phrase.substring(i, i + 1);
  
    // adds letter to the list of all different letters
    if (letters.indexOf(letter) == -1)
      letters = letters + " " + letter;
    
    // replaces letters with _
    if (!letter.equals(" "))
      phraseBlanks = phraseBlanks.replace(letter, "_");
  }
  public static void printBoard(){
    System.out.println(phraseBlanks);
  }

  public static void makeGuess(String guess){
    int charLocation = phrase.indexOf(guess);
    if (charLocation == -1){
      System.out.println("Nope, that letter isn't in the phrase.");
    } else {
      System.out.println("Yep, that letter is in the phrase.");
      while (charLocation != -1){
        phraseBlanks = phraseBlanks.substring(0, charLocation) + guess + phraseBlanks.substring(charLocation + 1);
      }
    }
    printBoard();
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