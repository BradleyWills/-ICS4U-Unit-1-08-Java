import java.util.Random;

/**
* The RandomNumArray program implements an application that generates a random 
* number based on the inputed max.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-03-01 
*/

public class RandomNumArray {
  // Create variables 
  static int randomizedNum;
  static int largest;
  static int smallest;
  static int[] numbers = new int[11];
  
  static int maxFinder(int[] numArray) {
    int maxValue = numArray[1];
    for (int j = 1; j <= numArray.length - 1; j++) {
      if (numArray[j] > maxValue) {
        maxValue = numArray[j];
      }
    }
    return maxValue;
  }
  
  static int minFinder(int[] numArray) {
    int minValue = numArray[1];
    for (int j = 1; j <= numArray.length - 1; j++) {
      if (numArray[j] < minValue) {
        minValue = numArray[j];
      }
    }
    return minValue;
  }
  
  /**
  * Calculates and checks if the users input is the same as the guess.
  */
  
  public static void main(String[] args) {
    Random randomizer = new Random();
    System.out.println("All the generated values are:");
    for (int i = 1; i <= 10; i++) {
      // Generate random number 1-99
      randomizedNum = (randomizer.nextInt(99)) + 1;
      // Appends the value to the array
      numbers[i] = randomizedNum;
      // Prints the random number
      System.out.println(randomizedNum);
    }
    // Calls the max value function
    largest = maxFinder(numbers);
    // Outputs the largest value in the array
    System.out.println("The largest value is " + largest + ".");
    // Calls the min value function
    smallest = minFinder(numbers);
    // Outputs the largest value in the array
    System.out.println("The smallest value is " + smallest + ".");
  }
}