package Hangman;

public class Main {
    public static void main(String[] args){
        Spinner s = new Spinner();
        int num = s.getRandomNum();
        System.out.println(num);

        Board newBoard = new Board();
        newBoard.initiateGame();



    }
}
