package Inheritance;

public class Classroom extends Room{
    String subject;

    public void speak(){
        System.out.println("Welcome, time to learn " + subject + "!");
    }

    public int calculateNumDesks(){
        return numPeople();
    }

    public void setSubject(String sub){
        subject = sub;
    }

    public String getSubject(){
        return subject;
    }
}
