import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (words.length == 0 || s.length() < words.length * words[0].length()) {
            return result;
        }

        // Store the words and their counts in a HashMap
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        int wordLen = words[0].length();
        int numWords = words.length;
        int windowLen = numWords * wordLen;

        // Iterate through each possible starting index of the substring
        for (int i = 0; i < s.length() - windowLen + 1; i++) {
            // Check if the substring starting at index i has the right composition of words
            if (hasRightComposition(s.substring(i, i + windowLen), wordLen, numWords, wordCount)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean hasRightComposition(String substring, int wordLen, int numWords, HashMap<String, Integer> wordCount) {
        // Create a new HashMap to store the counts of the words in the substring
        HashMap<String, Integer> substringWordCount = new HashMap<>();

        // Iterate through each word in the substring and update its count in the HashMap
        for (int i = 0; i < substring.length(); i += wordLen) {
            String word = substring.substring(i, i + wordLen);
            substringWordCount.put(word, substringWordCount.getOrDefault(word, 0) + 1);
        }

        // Check if the HashMap of the substring has the same composition of words as the input words
        return substringWordCount.equals(wordCount);
    }
}
