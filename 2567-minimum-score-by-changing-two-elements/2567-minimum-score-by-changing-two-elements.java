class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int hs1=Math.abs(nums[n-1]-nums[2]);
        int hs2=Math.abs(nums[n-2]-nums[1]);
        int hs3=Math.abs(nums[n-3]-nums[0]);
        return Math.min(hs1,Math.min(hs2,hs3));
    }
}