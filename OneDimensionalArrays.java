/**
 * One-dimensional arrays
 */

public class OneDimensionalArrays {

    public static void main(String[] args) {
        
        // Declare and initialise an array
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // loop through the array and print out each element
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element " + i + " is " + numbers[i]);
        }

        // declare and initialise a variable called sum
        int sum = 0;

        // loop through the array (see above) and use sum variable as an accumulator
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // calculate the average (double) and store it in a variable called average
        double average = sum / numbers.length;

        // print out the average like "The average is..."
        System.out.println("The average is " + average);

    }
}
