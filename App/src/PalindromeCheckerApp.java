import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String  originalString = sc.nextLine();
       String reversedString="";
       for(int i=originalString.length()-1;i>=0;i--){
           reversedString=reversedString+originalString.charAt(i);
       }
       if(originalString.equals(reversedString)){
           System.out.println("The string is a palindrome.");

       }
       else{
           System.out.println("The string is not a palindrome.");
       }
       sc.close();
    }

}
