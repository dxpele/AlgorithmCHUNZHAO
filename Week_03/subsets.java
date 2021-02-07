//1.递归回溯  O(n×2得n次方)  O(n)
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack( new ArrayList<Integer>(),nums, 0);
        return res;

    }

    private void backtrack(List<Integer> tmp, int [] nums, int start) {
        // 前序遍历得位置
        res.add(new ArrayList<Integer>(tmp));
        // 从start开始防止产生重复得子集
        for (int j = start; j < nums.length; j++) {
            // 做选择
            tmp.add(nums[j]);
            // 递归回溯
            backtrack(tmp, nums, j + 1);
            // 撤销选择
            tmp.remove(tmp.size() - 1);
        }
    }
}
//2.迭代  O(n×2得n次方)  O(n)
class Solution {
    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }
}