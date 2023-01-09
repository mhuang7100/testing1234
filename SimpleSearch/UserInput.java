package SimpleSearch;

 /*
 * UserInput
 * 
 * College Board Exclusion: You will not need to know 
 * the algorithms in these methods for the AP Test
 *
 * V1.0
 * 6/1/2019
 * Copyright(c) 2019 PLTW to present. All rights reserved
 */
import java.util.Scanner;

/**
 * Validate user input according to a list of acceptable inputs.
 * 
 * @author GShorr, PLTW
 */
public class UserInput
{
  /**
   * Verifies that one of the provided string array elements will be
   * returned as valid input.
   * <P>
   * Example usage:
   * String input = User.getValidInput("yes", "no", "y", "n");
   * <P>
   * Only yes, no, y, and n are valid inputs. If the user types anything
   * else, they will be prompted to re-enter.
   * <P>
   * Uppercase versions of the commands are acceptable and automatically
   * converted to lowercase prior to validating.
   * 
   * @return the valid command the user entered
   */
  private static Scanner sc = new Scanner(System.in);

  public static String getValidInput(String[] validInputs)
  {
    String input = "";
    boolean valid = false;
    while (!valid)
    {
      // String method toLowerCase converts any uppercase letters in 
      // the string to lowercase and returns the lowercase string
      input = sc.nextLine().toLowerCase();
      for (String str : validInputs)
      {
        // if any one input string matches, we're done
        if (input.equals(str.toLowerCase()))
          valid = true;
      }
      if (!valid)
        System.out.print("Invalid input. Please try again\n>");
    } 
    
    return input;
  }

   /**
   * Verifies that an intenger was entered
   * 
   * @return the integer the user entered
   */
  public static int getInt()
  {
    int input = 0;
    System.out.println("Enter a number to search for");
    try
    {
      // The Scanner method nextInt will throw an error
      // if the user does not enter an integer value
      input = sc.nextInt();
    }
    catch (Exception e)
    {
      System.out.println("You did not enter a number.");
    }
    return input;
  }
}