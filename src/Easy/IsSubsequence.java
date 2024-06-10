package Easy;

import java.util.Arrays;

public class IsSubsequence {

    public boolean isSubsequence3(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (t.isEmpty()) {
            return false;
        }
        char[] symbolsT = t.toCharArray();
        char[] symbolsS = s.toCharArray();
        char[] output = new char[t.length()];
        int j = 0;
        for (int i = 0; i < symbolsT.length; i++) {
            if (symbolsT[i] == symbolsS[j]) {
                output[i] = symbolsT[i];
                j++;
                if (j >= symbolsS.length) {
                    return true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char symbol : output) {
            if (Character.isLetter(symbol)) {
                sb.append(symbol);
            }
        }
        return s.equalsIgnoreCase(sb.toString());
    }


    public boolean isSubsequence(String s, String t) {
        char[] symbolsT = t.toCharArray();
        char[] symbolsS = s.toCharArray();
        Arrays.sort(symbolsT);
        System.out.println(symbolsT);

        char[] outputSymbols = new char[symbolsT.length];

        for (int i = 0; i < symbolsS.length; i++) {
            int firstIdx = 0;
            int lastIdx = symbolsT.length - 1;
            while (firstIdx <= lastIdx) {
                int middleIdx = (firstIdx + lastIdx) / 2;
                if (symbolsT[middleIdx] == symbolsS[i]) {
                    outputSymbols[middleIdx] = symbolsS[i];
                    break;
                }

                else if (symbolsT[middleIdx] > symbolsS[i]) {
                    lastIdx = middleIdx - 1;
                }

                else if (symbolsT[middleIdx] < symbolsS[i]) {
                    firstIdx = middleIdx + 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char symbol : outputSymbols) {
            if (Character.isLetter(symbol)) {
                sb.append(symbol);
            }
        }
        System.out.println(s);
        System.out.println(sb);
        return s.equalsIgnoreCase(sb.toString());
    }

    public boolean isSubsequence1(String s, String t) {
        char[] symbolsT = t.toCharArray();
        char[] symbolsS = s.toCharArray();
        Arrays.sort(symbolsS);

        System.out.println(Arrays.toString(symbolsS));
        System.out.println(Arrays.toString(symbolsT));

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < symbolsT.length; i++) {
            int firstIdx = 0;
            int lastIdx = s.length() - 1;
            while (firstIdx <= lastIdx) {
                int middleIdx = (firstIdx + lastIdx) / 2;
                if (symbolsS[middleIdx] == symbolsT[i]) {
                    sb.append(symbolsT[i]);
                    break;
                }

                else if (symbolsS[middleIdx] > symbolsT[i]) {
                    lastIdx = middleIdx - 1;
                }

                else if (symbolsS[middleIdx] < symbolsT[i]) {
                    firstIdx = middleIdx + 1;
                }
            }

        }
        System.out.println(sb);
        return sb.toString().equalsIgnoreCase(s);
    }

    public int test(int[] nums, int num) {
        Arrays.sort(nums);
        int firstIdx = 0;
        int lastIdx = nums.length - 1;
        while (firstIdx <= lastIdx) {
            int middleIdx = (firstIdx + lastIdx) / 2;

            if (nums[middleIdx] == num) {
                return nums[middleIdx];
            }

            else if (nums[middleIdx] > num) {
                lastIdx = middleIdx - 1;
            }

            else if (nums[middleIdx] < num) {
                firstIdx = middleIdx + 1;
            }
        }
        return -1;
    }


}
