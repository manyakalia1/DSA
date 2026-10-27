import java.util.*;
class Solution {
    private static void findCombinationSum(int index,int target,int[] candidates,  List<Integer> ds, 
        List<List<Integer>> ans
    ) {
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        if (index == candidates.length) {
            return;
        }
        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            findCombinationSum(index, target - candidates[index], candidates, ds, ans);
            ds.remove(ds.size() - 1); 
        }

        findCombinationSum(index + 1, target, candidates, ds, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationSum(0, target, candidates, new ArrayList<>(), ans);
        return ans;
    }
}