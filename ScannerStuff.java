import java.util.concurrent.TimeUnit;
import java.util.regex.*;
import java.util.Scanner;

public class ScannerStuff {
    public static Scanner input = new Scanner(System.in);

    /**
     * @param ms number of milliseconds to sleep for
     */
    public static void wait(int ms) {
        try {
            TimeUnit.MILLISECONDS.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    /**
     * Prompt user with prompt //VULNERABLE TO OVERFLOW
     * @param prompt String to prompt user with
     * @return First int that user enters
     */
    public static int scanInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String INPUT = input.nextLine();
            if (Pattern.matches("^[1-9]+[0-9]*$",INPUT)) //if matchFound
                return Integer.parseInt(INPUT);
            else
                System.out.println(Color.RED_BOLD+"Not an int. Try \"5\""+Color.RESET);
        }
    }
}