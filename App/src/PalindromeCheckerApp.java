public class PalindromeCheckerApp {
    static void main() {
        String word = "madam";
        boolean isPalindrome = true;
        int n = word.length() - 1;
        int start = 0;
        for (int i =0; i >0; i--){
            if (word.charAt(i) != word.charAt(start)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");

        }

    }
}
