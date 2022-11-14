package Hangman;
import java.util.Scanner;

public class Player {
    String name;
    int score;
    Scanner sc = new Scanner(System.in);

    // creates a player and gets their name
    public Player(int numPlayer){
        System.out.println("Who is Player" + numPlayer + "?");
        name = sc.nextLine();
    }

    public String toString(){
        return name;
    }

}
