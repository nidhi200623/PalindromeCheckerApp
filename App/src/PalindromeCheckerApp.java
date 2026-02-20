public class PalindromeCheckerApp {
    static void main(String[] args) {
        String arr1[] = {"h","e","l","l","o"};
        int n = arr1.length;
        boolean b = true;
        for ( int i =0 ; i<n/2 ; i++){
            if(arr1[i]!=arr1[n-i-1]){
                b= false;

            }

        }
         if(b){
             System.out.println("it is a palindrome");
         }
         else{
             System.out.println("it is a  not a palindrome");
         }
    }
}
