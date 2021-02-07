//1.摩尔投票法思路-对拼消耗  O(n)
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 1, candidate = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == candidate){
                cnt++;      
            }else if(--cnt == 0) {
                candidate = nums[++i];
                cnt = 1;
            }
        }
        return candidate;
    }
}

//2.排序  O(nlogn)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }
}