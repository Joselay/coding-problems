class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = clean.length();
        for(int i=0;i<n/2;i++)
            if(clean.charAt(i)!=clean.charAt(n-i-1))
                return false;
        return true;
    }
}
