package Hangman;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[H\033[2J");
        // assigns players, asks for names
        Player Player1 = new Player(1);
        Player Player2 = new Player(2);

        // initiates the game
        int playAgain = 1;
        int gamesPlayed = 0;
        while (playAgain == 1){
            Board newBoard = new Board(Player1, Player2);
            // player2 starts every other game if they decide to play again
            if (gamesPlayed % 2 != 0){
                newBoard.switchPlayer();
            }
            
            newBoard.initiateGame();

            // option to play again
            playAgain = 2;
            while (playAgain != 0 && playAgain != 1){
                System.out.println("Keep playing? You'll keep the same scores. [Y] Yes [N] No");
                String inputPlay = sc.nextLine();
                if (inputPlay.equals("N")){
                    playAgain = 0;
                } else if (inputPlay.equals("Y")){
                    playAgain = 1;
                } else playAgain = 2;
            }
        }

        System.out.println("Good Game!");
    }
}
