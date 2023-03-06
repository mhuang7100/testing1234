package Inheritance;

public class Teacher extends School{
    int salary;

    public int moneyPerClass(int numClasses){
        return salary / numClasses;
    }

    public void speak(){
        System.out.println("Welcome to my class, students.");
    }

    public void setSalary(int money){
        salary = money;
    }

    public int getSalary(){
        return salary;
    }
}
