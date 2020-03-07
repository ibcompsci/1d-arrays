import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsAndCollections1 {

    // Declare and initialise the ArrayLists
    private static ArrayList<Integer> randomNumbers = new ArrayList<>();
    private static ArrayList<Integer> oddNumbers = new ArrayList<>();
    private static ArrayList<Integer> evenNumbers = new ArrayList<>();

    // Populate the randomNumbers array with random numbers
    private static void populateArray() {
        int count = 0;
        while (count < 10) {
            randomNumbers.add((int)(Math.random() * 50));
            count++;
        }
    }

    // Check if the random numbers or off or even
    private static void readArray() {
        for (int currentNumber : randomNumbers) {
            if (currentNumber % 2 == 1) {
                assignOddNumbers(currentNumber);
            } else {
                assignEvenNumber(currentNumber);
            }
        }
    }

    // Assign odd numbers to the oddNumbers array
    private static void assignOddNumbers(int oddNum) {
        oddNumbers.add(oddNum);
    }

    // Assign even numbers to the evenNumbers array
    private static void assignEvenNumber(int evenNum) {
        evenNumbers.add(evenNum);
    }

    // Output contents of the oddNumbers and evenNumbers arrays
    private static void printToScreen() {
        System.out.print("Odd numbers: " + oddNumbers + "\n");
        System.out.print("Even numbers: " + evenNumbers + "\n");
    }

    // Sort the oddNumber and evenNumber arrays and print them out
    private static void sortAndDisplayArray() {
        Collections.sort(oddNumbers);
        System.out.print("Odd numbers (sorted)" + oddNumbers + "\n");
        Collections.sort(evenNumbers);
        System.out.print("Even numbers (sorted)" + oddNumbers);
    }

    public static void main(String[] args) {
        populateArray();
        readArray();
        printToScreen();
        sortAndDisplayArray();
    }
}
