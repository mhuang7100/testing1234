package Inheritance;

public class Classroom extends Room{
    String subject;

    public void speak(){
        System.out.println("Welcome, time to learn " + subject + "!");
    }

    public int calculateNumDesks(){
        return numPeople();
    }
}
