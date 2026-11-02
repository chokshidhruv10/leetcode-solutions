class Solution {
    public int minMoves2(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int mid=nums[n/2];
        int move=0;
        for(int i=0;i<n/2;i++){
            move+=Math.abs(nums[i]-mid);
            move+=Math.abs(nums[n-i-1]-mid);
        }
        return move;
    }
}