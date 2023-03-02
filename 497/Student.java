/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = ""; 
  private int id; 
  private int year;


  // Constructor 
  Student(String inputName, int inputId, int inputYear) 
  { 
    name = inputName;
    id = inputId;
    year = inputYear;
  } 

  public String toString(){
    return name + ", " + id + ", " + year;
  }

  public boolean equals(int inputId){
    return inputId == id;
  }

} 