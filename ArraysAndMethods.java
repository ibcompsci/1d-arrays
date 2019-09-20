/**
 * A program that demonstrates the use of arrays and methods.
 * Created by Robert Griffiths on 17/9/2019
 * www.ibcompsci.net
 */
 
public class ArraysAndMethods {

    /*
     * Declare the the needed arrays
     */
    private static int[][] randomNumbers;
    private static int[] oddNumbers;
    private static int[] evenNumbers;

    /*
     * Initialisation and method calls
     * @param args
     */
    public static void main(String[] args) {

        // Initialise the arrays
        randomNumbers = new int[4][4];
        oddNumbers = new int[20];
        evenNumbers = new int[20];

        // Call methods
        populateArray();
        readArray();
    }

    /*
     * Populate the array with random numbers
     */
    private static void populateArray() {
       for (int row = 0; row < randomNumbers.length; row++) {
          for (int col = 0; col < randomNumbers.length; col++) {
              randomNumbers[row][col] = (int)(Math.random() * 50);
            }
        }
    }

    /*
     * Read the array and send the output to the correct method
     */
    private static void readArray() {
        for (int row = 0; row < randomNumbers.length; row++) {
            for (int col = 0; col < randomNumbers.length; col++) {
                int currentNumber = randomNumbers[row][col];
                if(currentNumber % 2 == 1) {
                    assignOddNumbers(currentNumber);
                } else {
                    assignEvenNumber(currentNumber);
                }
            }
        }
    }

    /*
     * Assign the odd numbers to the oddNumbers array
     * @param oddNum
     */
    private static void assignOddNumbers(int oddNum) {
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = oddNum;
            String result = "Odd number: " + oddNum;
            printToScreen(result);
        }
    }

    /*
     * Assign the even numbers to the evenNumbers array
     * @param evenNum
     */
    private static void assignEvenNumber(int evenNum) {
        for (int i = 0; i < oddNumbers.length; i++) {
            evenNumbers[i] = evenNum;
            String result = "Even number: " + evenNum;
            printToScreen(result);
        }
    }

    /*
     * Output the results from assignOddNumbers to assignEvenNumbers
     * @param result
     */
    private static void printToScreen(String result) {        
        System.out.println(result);
    }
}
