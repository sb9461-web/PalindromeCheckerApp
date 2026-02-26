public class PalindromeCheckerApp {
    static void main() {
        String word = "BHAAI" ;
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        boolean ispalindrome = true;
        boolean isPalindrome = false;
        while (start < end) {
            if (word.charAt(end) != word.charAt(start)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if(isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");

        }

    }
}
