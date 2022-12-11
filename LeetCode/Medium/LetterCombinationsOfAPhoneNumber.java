import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        helper(new StringBuilder(), combinations, map, digits);

        return combinations;
    }

    private void helper(StringBuilder prefix, List<String> combinations, Map<Character, String> map, String digits) {
        if (prefix.length() == digits.length()) {
            combinations.add(prefix.toString());
            return;
        }

        String letters = map.get(digits.charAt(prefix.length()));
        for (int i = 0; i < letters.length(); i++) {
            prefix.append(letters.charAt(i));
            helper(prefix, combinations, map, digits);
            prefix.deleteCharAt(prefix.length() - 1);
        }
    }
}
