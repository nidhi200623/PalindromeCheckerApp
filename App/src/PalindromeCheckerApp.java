import java.util.Scanner;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Step 1: Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Step 2: Read input string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Step 3: Create Stack
        Stack<Character> stack = new Stack<>();

        // Step 4: Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 5: Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
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

