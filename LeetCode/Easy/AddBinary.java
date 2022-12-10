class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += Integer.parseInt(a.charAt(i) + "");
                i -= 1;
            }
            if (j >= 0) {
                sum += Integer.parseInt(b.charAt(j) + "");
                j -= 1;
            }
            if (sum >= 2) {
                carry = 1;
                sum -= 2;
            } else
                carry = 0;
            result = sum + result;
        }

        if (carry == 1)
            result = "1" + result;

        return result;
    }
}
