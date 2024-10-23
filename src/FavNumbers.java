import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int favNumber;
        double favDouble;
        favNumber = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = SafeInput.getDouble(in, "Enter your favorite number");
        System.out.println("\nYour favorite integer is: " + favNumber + " and your favorite number is: " + favDouble);
    }
}
