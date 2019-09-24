/**
 * A program to demonstrate two-dimensional arrays
 */

public class TwoDimensionalArrays {

    public static void main(String[] args) {

        int[][] myArray = new int[4][5];
        int i, j, k = 0;

        // Fill the array with sequential numbers
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                myArray[i][j] = k;
                k++;
            }
        }

        // Print the contents of the array vertically
        for(i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(myArray[i][j] + "");
                System.out.println("");
            }
        }
        
        // Print the content of the array in table format
	for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(myArray[i][j] + "\t\t");
            }
            System.out.println(" ");
        }

    }

}
