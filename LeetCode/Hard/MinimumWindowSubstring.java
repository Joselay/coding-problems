import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> tCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }
        int start = 0, end = 0, minStart = 0, minLength = Integer.MAX_VALUE, count = t.length();
        while (end < s.length()) {
            char c = s.charAt(end);
            if (tCount.containsKey(c)) {
                tCount.put(c, tCount.get(c) - 1);
                if (tCount.get(c) >= 0) {
                    count--;
                }
            }
            while (count == 0) {
                if (end - start + 1 < minLength) {
                    minStart = start;
                    minLength = end - start + 1;
                }
                c = s.charAt(start);
                if (tCount.containsKey(c)) {
                    tCount.put(c, tCount.get(c) + 1);
                    if (tCount.get(c) > 0) {
                        count++;
                    }
                }
                start++;
            }
            end++;
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}
