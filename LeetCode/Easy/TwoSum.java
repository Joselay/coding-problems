class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = target-nums[i];
            if(map.containsKey(c))
                return new int[] {map.get(c),i};
            map.put(nums[i],i);
        }
        return new int[0];
    }
}
