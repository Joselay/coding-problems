class Solution {
    public int strStr(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) {
            return -1;
        }

        int n = s.length();
        int m = t.length();

        for (int i = 0; i < n - m + 1; i++) {
            int j = 0;
            while (j < m && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }

            if (j == m) {
                return i;
            }
        }

        return -1;
    }
}
