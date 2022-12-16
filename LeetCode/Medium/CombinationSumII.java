class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(combinations, new ArrayList<>(), candidates, target, 0);
        return combinations;
    }
    
    private void backtrack(List<List<Integer>> combinations, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) combinations.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < candidates.length; i++) {
                if (i > start && candidates[i] == candidates[i - 1]) continue;
                tempList.add(candidates[i]);
                backtrack(combinations, tempList, candidates, remain - candidates[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
