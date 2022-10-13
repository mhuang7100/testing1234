/*
 * Activity 2.4.1
 */
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
      int someint = sc.nextInt();
      System.out.println(someint);
    }
    
  }

  @Override
  public String toString() {
    return "Main []";
  }
}