package temp;

public class profit_loss {
    public static void main(String[] args) {
        double cost = 7200;

        double discount1 = 0.20 * cost;
        double discountedPrice1 = cost - discount1;

        double discount2 = 0.10 * discountedPrice1;
        double discountedPrice2 = discountedPrice1 - discount2;

        double totalDiscount = discount1 + discount2;

        System.out.println("Selling Price (SP): " + discountedPrice2);
        System.out.println("Total Discount Given: " + totalDiscount);
    }
}
