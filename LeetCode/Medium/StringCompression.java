class Solution {
    public int compress(char[] chars) {
        int n = chars.length, i = 0, j = 0;
        while (j < n) {
            char c = chars[j];
            int count = 0;
            while (j < n && chars[j] == c) {
                j++;
                count++;
            }
            chars[i++] = c;
            if (count > 1) {
                for (char cnt : Integer.toString(count).toCharArray()) {
                    chars[i++] = cnt;
                }
            }
        }
        return i;
    }
}
