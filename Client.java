import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Client {
    /**
     * @param ms number of milliseconds to sleep for
     */
    private static void wait(int ms) {
        try { //.sleep() for `ms` MILLISECONDS
            TimeUnit.MILLISECONDS.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    private static Scanner input = new Scanner(System.in);
    public static void main (String[] args)  {
        while (true) {
		    System.out.println(Color.GREEN_BACKGROUND + "🟩🟩🟩🐑");
		    System.out.println(Color.GREEN_BACKGROUND + "🟩🟩🐑🟩");
		    System.out.println(Color.GREEN_BACKGROUND + "🟩🐑🟩🟩");
		    System.out.println(Color.GREEN_BACKGROUND + "🐑🟩🟩🟩");
		    System.out.println(Color.GREEN_BACKGROUND + "🟩🟩🟩🟩");
            
            Tile[][] world = new Tile[5][5];

            String INPUT = input.next();
            switch (INPUT) {
                case "a":
                    return;
                default:
            }
            wait(900);
        }
	}
}