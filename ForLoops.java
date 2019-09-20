/**
 * A program that demonstrates for loops.
 */

public class ForLoops {

    public static void main(String[] args) {

        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for-each loop
        String[] students = {"Breyton", "Marco", "Luis", "Marta", "Juliana", "Maria"};
        for (String i : students) {
            System.out.println(i);
        }

    }

}
