package Inheritance;

public class Senior extends Student{
    boolean goingToCollege;

    public void skipClass(){
        System.out.println("I'm skipping class and no one can stop me.");
    }

    public void speak(){
        System.out.println("I can't wait to be free");
    }

    public void setCollege(boolean college){
        goingToCollege = college;
    }

    public boolean getCollege(){
        return goingToCollege;
    }
}
