import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        boolean yesOrNo = false;
        double totalCost = 0;
        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter your the price of your item [$0.50-$10.00]", .5, 10.00);
            yesOrNo = SafeInput.getYNConfirm(in, "Are you finished with items? Enter Y/N");
            totalCost += itemPrice;
        }while (!yesOrNo);
        System.out.printf("The total cost of your item(s) is: $%.2f\n", totalCost);
    }
}
