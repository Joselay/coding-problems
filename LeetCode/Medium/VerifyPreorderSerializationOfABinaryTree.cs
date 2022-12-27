public class Solution {
    public bool IsValidSerialization(string preorder) {
        string[] nodes = preorder.Split(',');
        int diff = 1;
        foreach (string node in nodes) {
            if (--diff < 0) return false;
            if (node != "#") diff += 2;
        }
        return diff == 0;
    }
}
