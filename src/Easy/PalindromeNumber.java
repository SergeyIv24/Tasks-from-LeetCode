//https://leetcode.com/problems/palindrome-number/

package Easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        String reverseNum = "";
        String xToStr = String.valueOf(x);
        for (int i = (xToStr.length() - 1); i >= 0; i--){
            reverseNum = reverseNum + xToStr.charAt(i);
        }
        if (reverseNum.equalsIgnoreCase(xToStr)){
            return true;
        } else {
            return false;
        }
    }
}
