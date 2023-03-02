/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("Bob", 1930, 12); 

    // Below two statements are equivalent 
    System.out.println(s.equals(1931)); 
    System.out.println(s.equals(1930)); 
    System.out.println(s.toString()); 

  } 
} 