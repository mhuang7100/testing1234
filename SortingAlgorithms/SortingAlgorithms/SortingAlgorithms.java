package SortingAlgorithms;

/**
 * Avticity 3.7.6
 */
import java.util.ArrayList;

public class SortingAlgorithms
{
  /**
   * Perform a selection sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> selectionSortInt(ArrayList<Integer> intList)
  {
    int counter = 0;
    for (int i = 0; i < intList.size(); i++){
      int min = intList.get(i);
      int indexMin = i; 
      for (int j = i; j < intList.size(); j++){
        if (intList.get(j) < min){
          min = intList.get(j);
          indexMin = j;
        }
        counter += 1;
      }
      intList.set(indexMin, intList.get(i));
      intList.set(i, min);
    }
    
    System.out.println(counter);
    return intList;
  }

  /**
   * Perform an insertion sort an ArrayList of integers
   * @param intList an ArrayList of integers
   * @return intList sorted from smallest to largest
   */
  public static ArrayList<Integer> insertionSortInt(ArrayList<Integer> intList)
  {
    int counter = 0;
    for (int i = 1; i < intList.size(); i++){
      for (int j = 0; j < i; j++){
        if (intList.get(i) > intList.get(j) && intList.get(i) < intList.get(j + 1)){
          intList.add(j, intList.get(i));
          intList.remove(intList.get(i));
          break;
        }
        counter += 1;
      }
    }
    System.out.println(counter);
    return intList;
  }

  /**
   * Perform a selection sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */ 
  public static ArrayList<Double> selectionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 0; i < doubleList.size(); i++){
      double min = doubleList.get(i);
      int indexMin = i; 
      for (int j = i; j < doubleList.size(); j++){
        if (doubleList.get(j) < min){
          min = doubleList.get(j);
          indexMin = j;
        }
      }
      doubleList.set(indexMin, doubleList.get(i));
      doubleList.set(i, min);
    }
    
    return doubleList;
  }

  /**
   * Perform an insertion sort an ArrayList of doubles
   * @param doubleList an ArrayList of doubles
   * @return doubleList sorted from smallest to largest
   */
  public static ArrayList<Double> insertionSortDouble(ArrayList<Double> doubleList)
  {
    for (int i = 1; i < doubleList.size(); i++){
      for (int j = 0; j < i; j++){
        if (doubleList.get(i) > doubleList.get(j) && doubleList.get(i) < doubleList.get(j + 1)){
          doubleList.add(j, doubleList.get(i));
          doubleList.remove(doubleList.get(i));
          break;
        } 
      }
    }

    return doubleList;
  }

}