package Inheritance;

public class Room extends School{
    int area;

    public int numPeople(){
        return area / 5;
    }

    public void speak(){
        System.out.println("Welcome to this room with " + area + " area!");
    }

    public void setArea(int area){
        this.area = area;
    }

    public int getArea(){
        return area;
    }
}
