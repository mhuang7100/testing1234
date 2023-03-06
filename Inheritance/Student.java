package Inheritance;

public class Student extends School{
    double GPA;

    public void speak(){
        System.out.println("My name is " + name);
    }

    public boolean isPassing(){
        if (GPA > 2.0){
            return true;
        } else return false;
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public double GPA(){
        return GPA;
    }
}
