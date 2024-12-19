import java.util.Scanner;

public class TimeSinceMidnightCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of seconds since midnight: ");
        int totalSeconds = sc.nextInt();
        sc.close();

        int hours = totalSeconds / 3600;
        int remainder = totalSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;

        System.out.println("Time passed since midnight:");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
