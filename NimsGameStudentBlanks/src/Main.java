import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            //Asks the user to input thier name for the player
            System.out.println("What is player1's name?: ");
            String name = sc.nextLine();
            Player p1 = new Player(name);

            //Asks the user to input their name for the player.
            System.out.println("What is player2's name?: ");
            name = sc.nextLine();
            Player p2 = new Player(name);

            String again = "Literally any string";
            Player currentPlayer;
            
            //Runs the game
            while (!again.equals("q")){
                //Generates the game
                //TO DO: Create "game"
                Game game = new Game(p1, p2);
                //TO DO: Set the a random player as the current player
                if (Math.random() < .5){
                    currentPlayer = p1;
                } else currentPlayer = p2;

                game.setFirstPlayer(currentPlayer);
                //This is the loop in which the game will be played
                while(!game.isComplete()){
                   //TO DO
                    game.takePiece();
                    currentPlayer = game.getNextPlayer();
                }
                System.out.println(currentPlayer.getName()+ " Won!!");
                System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
                System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
                System.out.println("------------------------------------------");
                System.out.println("Enter q to quit, enter anything else to play again.");
                again = sc.nextLine();
            }
        }

        System.out.println("Thank you for playing!");
    }
}
