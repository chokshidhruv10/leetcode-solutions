class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for(int i = 0,k = 0,j=n;k<nums.length;i++,j++,k+=2){
            ans[k]=nums[i];
            ans[k+1]=nums[j];
        }
        return ans;
    }
}