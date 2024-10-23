import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (format: XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (format: M#####)", "^(M|m)\\d{5}$");
        System.out.println("M Number entered: " + mNumber);
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice (O for Open, S for Save, V for View, Q for Quit)", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);
    }
}
