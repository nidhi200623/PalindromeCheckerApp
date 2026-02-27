import java.util.Scanner;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Create Scanner
        Scanner sc = new Scanner(System.in);

        // Step 2: Read input
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Step 3: Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Step 4: Insert characters into Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 5: Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();   // Remove from front
            char rear = deque.removeLast();     // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Step 6: Print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}