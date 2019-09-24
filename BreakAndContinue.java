/**
 * Break and continue statements.
 */

public class BreakAndContinue {

    public static void main(String[] args) {

        // Break out of the while loop if condition is true
        int x = 0;
        while (x < 15) {
            System.out.print(x + " ");
            x++;
            if (x == 9) {
                break;
            }
        }
        System.out.print("\n");

        // Continue looping if condition is true
        int y = 0;
        while (y < 15) {
            if (y == 9) {
                y++;
                continue;
            }
            System.out.print(y + " ");
            y++;
        }
        System.out.print("\n");

        // Break out of the for loop if condition is true
        for (int i = 0; i < 20; i++) {
            if (i == 12) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n");

        // Continue looping if condition is true
        for (int j = 0; j < 20; j++) {
            if (j == 12) {
                continue;
            }
            System.out.print(j + " ");
        }

    }

}
