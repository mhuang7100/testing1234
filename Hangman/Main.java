package Hangman;

public class Main {
    public static void main(String[] args){
        //test
        Spinner s = new Spinner();
        int num = s.getRandomNum();
        System.out.println(num);

        System.out.println("\033[H\033[2J");
        // assigns players, asks for names
        Player Player1 = new Player(1);
        Player Player2 = new Player(2);

        // initiates the game
        Board newBoard = new Board(Player1, Player2);
        newBoard.initiateGame();



    }
}
