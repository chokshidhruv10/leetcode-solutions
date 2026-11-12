class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlength=1;
        int increment=1;
        int decrement=1;
        for(int j=1;j<nums.length;j++){
            if(nums[j]>nums[j-1]){
                increment++;
                decrement=1;
            }else if(nums[j]<nums[j-1]){
                decrement++;
                increment=1;
            }else{
                increment=1;
                decrement=1;
            }
            maxlength=Math.max(maxlength,Math.max(increment,decrement));
        }
        return maxlength;
    }
}