import java.util.Scanner;

public class TimeSinceMidnightCalculator {

    // Class constants
    private static final double MIN_SECONDS = 0.0; // Cannot be negative

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSeconds = getValidatedInput(scanner,
                "Enter the number of seconds since midnight: ",
                MIN_SECONDS,
                "Seconds must be greater than or equal to 0.");
        scanner.close();
        processAndDisplayResults((int)totalSeconds);
    }

    /**
     * Validates user input ensuring it is greater than or equal to a given minimum value.
     *
     * @param scanner      The scanner object used for reading input.
     * @param prompt       The message to display to the user.
     * @param minValue     The minimum acceptable value for the input.
     * @param errorMessage The error message displayed when invalid input is given.
     * @return The validated numeric input.
     */
    private static double getValidatedInput(Scanner scanner, String prompt, double minValue, String errorMessage) {
        double inputValue;

        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                inputValue = scanner.nextDouble();
                if (inputValue >= minValue) {
                    return inputValue; // Valid input
                } else {
                    System.out.println(errorMessage);
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }
    }

    /**
     * Processes the input data (total seconds) to calculate hours, minutes, and seconds
     * and displays the results.
     *
     * @param totalSeconds The total number of seconds since midnight.
     */
    private static void processAndDisplayResults(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int remainder = totalSeconds % 3600;
        int minutes = remainder / 60;
        int seconds = remainder % 60;

        displayResults(hours, minutes, seconds);
    }

    /**
     * Displays the calculated hours, minutes, and seconds passed since midnight.
     *
     * @param hours   The hours passed since midnight.
     * @param minutes The minutes passed since midnight.
     * @param seconds The seconds passed since midnight.
     */
    private static void displayResults(int hours, int minutes, int seconds) {
        System.out.println("Time passed since midnight:");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}