/*
 * Activity 2.4.4
 */
public class Main
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");

    for (int i = 0; i < 26; i++){
      String letter = letters.substring(i, i + 1);
      int freq = 0;
      for (int j = 0; j < phrase.length(); j++){
        if (phrase.substring(j, j + 1).toLowerCase().equals(letter))
          freq += 1;
      }
      System.out.println(letters.substring(i, i + 1) + ": " + freq);
    }
	}
}
