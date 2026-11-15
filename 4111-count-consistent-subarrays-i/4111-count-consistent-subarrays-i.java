class Solution {
    public int countConsistent(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int minvalue=Integer.MAX_VALUE;
            int ans=-1;
            for(int j=i;j<nums.length;j++){
                ans=ans & nums[j];
                minvalue=Math.min(minvalue,nums[j]);
                if(minvalue==ans){
                    count++;
                }
            }
        }
        return count;
    }
}