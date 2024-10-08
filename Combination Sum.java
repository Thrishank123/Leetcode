class Solution {
    void findsum(int index, int[] candidates, List<List<Integer>> result, int target, List<Integer> temp) {
        if (target == 0) {
            result.add(new ArrayList<>(temp));  
            return;
        }
        if (target < 0 || index == candidates.length) {
            return;
        }
        temp.add(candidates[index]);
        findsum(index, candidates, result, target - candidates[index], temp);
        temp.remove(temp.size() - 1);
        findsum(index + 1, candidates, result, target, temp);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        findsum(0, candidates, result, target, temp);
        return result;
    }
}
