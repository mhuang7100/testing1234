package Hangman;

public class Spinner {
    int randomNumber;  
    
    public int getRandomNum(){
        this.randomNumber=(int)((Math.random() * 2500));
        System.out.println("You got: "+ randomNumber);
        return this.randomNumber;
    }
    
}
