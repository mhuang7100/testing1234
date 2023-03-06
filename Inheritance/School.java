package Inheritance;

public class School {
    String name;
    
    public String toString(){
        return "Welcome to " + name;
    }

    public void speak(){
        System.out.println(name + " is the best!");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
