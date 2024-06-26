package Easy;

public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] sentence = s.split(" ");
        String[] sortedSentence = new String[sentence.length];

        for (int i = 0; i < sentence.length; i++) {
            int minIdx = findMinimumIdx(sentence);
            sortedSentence[i] = sentence[minIdx].substring(0, sentence[minIdx].length() - 1);
            sentence[minIdx] = "rr";
        }
        return String.join(" ", sortedSentence);
    }

    public int findMinimumIdx(String[] sentence) {
        String minimumWord = sentence[0];
        int minimumWordIdx = 0;

        for (int i = 1; i < sentence.length; i++) {
            if (sentence[i].charAt(sentence[i].length() - 1)
                    < minimumWord.charAt(minimumWord.length() - 1)) {
                minimumWord = sentence[i];
                minimumWordIdx = i;
            }
        }
        return minimumWordIdx;
    }
}

