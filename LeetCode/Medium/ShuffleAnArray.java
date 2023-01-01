class Solution {
    private int[] nums;
    private Random rand;

    public Solution(int[] nums) {
        this.nums = nums;
        rand = new Random();
    }
    
    public int[] reset() {
        return nums;
    }
    
    public int[] shuffle() {
        if (nums == null) return null;
        int[] a = nums.clone();
        for (int i = 1; i < a.length; i++) {
            int j = rand.nextInt(i + 1);
            swap(a, i, j);
        }
        return a;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
