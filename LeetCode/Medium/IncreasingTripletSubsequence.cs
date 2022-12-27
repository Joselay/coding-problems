public class Solution {
    public bool IncreasingTriplet(int[] nums) {
        int small = int.MaxValue, big = int.MaxValue;
        foreach(int num in nums) {
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
