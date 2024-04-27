//https://leetcode.com/problems/length-of-last-word/description/
//Easy

package Easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
