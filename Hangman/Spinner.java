package Hangman;

public class Spinner {
    int randomNumber;  
    
    public int getRandomNum(){
        randomNumber= ((int)((Math.random() * 24) + 1) * 100);
        return this.randomNumber;
    }
    
}
