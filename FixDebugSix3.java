import java.util.Scanner;

public class FixDebugSix3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int userNum, val;
        final int MIN = 1;
        final int MAX = 20;
        final int TIME_WASTER = 100000;

        System.out.print("Enter a number between " + MIN + " and " + MAX + " >> ");
        userNum = keyboard.nextInt();

        // Ensure user input is within range [1, 20]
        while (userNum < MIN || userNum > MAX) {
            System.out.println("Number out of range");
            System.out.print("Enter a number between " + MIN + " and " + MAX + " inclusive >> ");
            userNum = keyboard.nextInt();
        }

        // Countdown loop
        for (val = userNum; val >= 0; --val) {
            System.out.print(val + "  ");
            // Simple delay mechanism using a loop
            for (int x = 0; x < TIME_WASTER; ++x)
                for (int y = 0; y < TIME_WASTER; ++y)
                    for (int z = 0; z < TIME_WASTER; ++z) {
                        // Empty body to waste time
                    }
        }

        System.out.println("Blastoff!");
    }
}
