public class OutputToConsole {

    public static void main(String[] args) {

        // Output to console on different line
        System.out.println("Hello World");

        // Output contents of variable to console
        String username = "Joe";
        System.out.println(username);

        // Concatenate contents of variable to a string
        String studentName = "Maria";
        System.out.println("The student's name is " + studentName);

        // Various way to format output
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // Output numbers on different lines
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // Output numbers on same line
        System.out.print(num1);
        System.out.print(num2);
        System.out.print(num3);

        // Using newline (\n) and tab (\t) to space out numbers
        System.out.print("\n" + num1);
        System.out.print("\t" + num2);
        System.out.print("\t" + num3);

    }
}
