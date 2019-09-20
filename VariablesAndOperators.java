/**
 * A program that demonstrates how to use variable, operators and if statments.
 */
 
public class VariablesAndOperators {

    public static void main(String[] args) {

        String firstName = "John";
        char initial = 'J';
        final int yearBorn = 1980;
        int currentYear = 2019;
        int maxAge = 30;

        String telNumber = "012345679";
        boolean employed = true;
        String jobTitle = "Programmer";

        long longNumber = 37492729L;
        float floatNumber = 1.3f;

        int currentAge = currentYear - yearBorn;

        if (currentAge > maxAge) {
            System.out.println(firstName + " was born in " + yearBorn + " and is now " + currentAge +  ", so he is old.");
        } else {
            System.out.println(firstName + " was born in " + yearBorn + " and is now " + currentAge +  ", so he is young.");
        }

    }

}
