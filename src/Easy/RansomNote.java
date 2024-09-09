//https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150

package Easy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.isEmpty() || magazine.isEmpty()) {
            return false;
        }

        Map<Integer, Character> dictionary = new HashMap<>();
        Integer i = 0;
        for (Character letter : magazine.toCharArray()) {
            dictionary.put(i, letter);
            i++;
        }

        for (Character letters : ransomNote.toCharArray()) {
            Collection<Character> alphabet = dictionary.values();
            if (alphabet.contains(letters)) {
                alphabet.remove(letters);
            } else {
                return false;
            }
        }
        return true;
    }
}
