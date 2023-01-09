package SimpleSearch;

/*
 * Activity 3.7.5
 */
public class SimpleSearchRedo
{
  public static void main(String[] args)
  {
    int[] primeUnder50 = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    int numToSearchFor = UserInput.getInt();
    
    int index = 0;
    for (int x : primeUnder50){
        if (x == numToSearchFor){
            System.out.println("Index: " + index);
        }
        index += 1;
    }
    
    
    
  }
}