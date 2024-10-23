import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        int num = SafeInput.getInt(in, "Enter an integer");
        double dou = SafeInput.getDouble(in, "Enter a number");
        int rangedInt = SafeInput.getRangedInt(in, "Enter an integer within the range [1-10]", 0, 10);
        double rangedDouble = SafeInput.getRangedDouble(in, "Enter a number within the range [1-10]", 0.0, 10.0);
        boolean getYNConfirm = SafeInput.getYNConfirm(in, "Enter [Y/N]");
        String regEx = SafeInput.getRegExString(in, "Enter the word free", "free");
    }
}
