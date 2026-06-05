import java.util.*;

public class SmashGoalGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Step 1: Generate 3 unique random digits
        int[] computer = new int[3];
        Set<Integer> used = new HashSet<>();
        int i = 0;
        while (i < 3) {
            int num = rand.nextInt(10); // single digit
            if (!used.contains(num)) {
                computer[i++] = num;
                used.add(num);
            }
        }

        System.out.println("Welcome to Smash & Goal Game!");
        System.out.println("Try to guess the 3-digit number!");

        while (true) {
            // Step 2: Get user input
            System.out.print("Enter 3 digits (separated by space): ");
            int[] user = new int[3];
            for (i = 0; i < 3; i++) {
                user[i] = sc.nextInt();
            }

            // Step 3: Compare
            int smash = 0;
            int goal = 0;

            for (i = 0; i < 3; i++) {
                if (user[i] == computer[i]) {
                    smash++;
                } else if (contains(computer, user[i])) {
                    goal++;
                }
            }

            // Step 4: Output result
            System.out.println("Smash: " + smash + ", Goal: " + goal);

            if (smash == 3) {
                System.out.println("Congratulations! You guessed it right!");
                break;
            }
        }

        sc.close();
    }

    // Helper method to check if value exists in array
    public static boolean contains(int[] arr, int val) {
        for (int x : arr) {
            if (x == val) return true;
        }
        return false;
    }
}
