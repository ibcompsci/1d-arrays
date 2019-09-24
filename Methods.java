/**
 * Methods and method calls.
 */


public class Methods {

    public static void main(String[] args) {

        int x = 23;
        int y = 65;

        addNumbers(x, y);		// call the addNumbers method
        checkLessThan(x, y);	// call checkLessThan method
        checkTrue(true);		// call the checkTrue method

    }

    // add two numbers together
    private static void addNumbers(int x, int y) {

        int total = x + y;
        System.out.println("Addition total is " + total);

    }


    // check whether is number is less than another number
    private static void checkLessThan(int x, int y) {

        if (x < y) {
            System.out.println("X is less than Y");
        }
        else {
            System.out.println("X is greater than Y");
        }

    }


    // check if a boolean variable is true
    private static void checkTrue(boolean b) {
        if (b) {
            System.out.println("b is true");
        }
        else {
            System.out.println("b is false");
        }
    }
}

