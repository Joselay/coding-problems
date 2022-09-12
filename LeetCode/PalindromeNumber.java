public class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0)
            return false;
        if( x >=0 && x <= 9)
            return true;
        if(x%10 ==0) return false;
    
        int y = 0;
        while(x >= y) {
            if(x == y) return true;
            y = y *10 + x%10;
            if(x == y) return true;
            x = x/10;
        }
        return false;
    }
}
