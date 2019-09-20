/**
 * Program that demonstrates if statements.
 */

public class IfStatements {

    public static void main(String[] args) {

        // if statement
        if (50 > 30) {
            System.out.println("50 is greater than 30");
        }

        // if statement using variables
        int num1 = 30;
        int num2 = 50;
        if (num1 < num2) {
            System.out.println("Number 1 is less than number 2");
        }

        // else statement
        int temp = 17;
        if (temp < 18) {
            System.out.println("Take a jacket with you.");
        } else {
            System.out.println("You should be fine with just a shirt today.");
        }

        // else if statement
        int passGrade = 16;
        if (passGrade < 14) {
            System.out.println("You failed the test.");
        } else if (passGrade >= 14) {
            System.out.println("You passed the test.");
        } else {
            System.out.println("You didn't sit the test.");
        }

        // Simplified if statement
        int cash = 4;
        String outcome = (cash < 5) ? "You don't have enough money for a burger" : "You have enough money for a burger.";
        System.out.println(outcome);
    }
}
