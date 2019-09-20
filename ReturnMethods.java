public class ReturnMethods {

    public static void main(String[] args) {

        final double starter = 27.50;
        final double mainDish = 40.00;
        final double dessert = 25.00;
        final double drinks = 10.00;

        double bill = calculateBill(starter, mainDish, dessert, drinks);
        double tip = calculateTip(bill);
        double totalBill = calculateTotalBill(bill, tip);
        displayTotal(totalBill);
        
    }

    private static double calculateBill(double starter, double mainDish, double dessert, double drinks) {
        return starter + mainDish + dessert + drinks;
    }

    private static double calculateTip(double bill) {
        return bill * 0.10;
    }

    private static double calculateTotalBill(double bill, double tip) {
        return  bill + tip;
    }

    private static void displayTotal(double tb) {
        System.out.println("The final bill is $" + tb);

    }

}
