package temp;

public class calculate_GST {
    public static void main(String[] args) {
        float price = 10000;
        float GST = 18;
        float tax = price * (GST / 100);
        float total_amount = tax + price;
        System.out.println("Tax = " + tax);
        System.out.println("Total amount = " + total_amount);
    }
}