import java.util.Collections;

public class ArrayListAndCollections2 {

    public static void main(String args[]) {

        java.util.ArrayList<String> students = new java.util.ArrayList<String>();

        students.add("Breyton");
        students.add("Luis");
        students.add("Marta");
        students.add("Marco");
        students.add("Juliana");
        students.add("Maria");

        // Display all elements
        System.out.println(students);

        // Display an element based on an index
        System.out.println(students.get(0));
        System.out.println(students.get(1));
        System.out.println(students.get(2));
        System.out.println(students.get(3));
        System.out.println(students.get(4));
        System.out.println(students.get(5));

        // Modify an element based on an index
        students.set(3, "John");
        System.out.println(students.get(3));

        // Remove an element based on an index
        students.remove(3);
        System.out.println(students.get(3));

        // Display all the element using a for loop
        for (String i : students) {
            System.out.println(i);
        }

        // Sort the elements
        Collections.sort(students);

        // Display all the element using a for loop
        for (String i : students) {
            System.out.println(i);
        }

        // Remove all element in the ArrayList
        students.clear();
        System.out.println(students);

        // Check if all the elements have been cleared
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println(students);
        }
    }
}
