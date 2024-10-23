import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth;
        int birthYear;
        int birthDay;
        int birthHours;
        int birthMinutes;
        birthYear = SafeInput.getRangedInt(in, "Enter your year of birth [1950-2015]", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Enter the month you were born [1-12]", 1, 12);
        int maxDays;
        switch (birthMonth) {
            case 2:
                maxDays = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }
        birthDay = SafeInput.getRangedInt(in, "Enter the day of birth [1-" + maxDays + "]", 1, maxDays);
        birthHours = SafeInput.getRangedInt(in, "Enter the hour you were born [1-24]", 1, 24);
        birthMinutes = SafeInput.getRangedInt(in, "Enter the minute you were born [1-59]", 1, 59);

        System.out.println("Your birth date and time:");
        System.out.printf("%d-%02d-%02d %02d:%02d\n", birthYear, birthMonth, birthDay, birthHours, birthMinutes);
    }
}
