class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=nums[n-1];
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=max-nums[i];
            sum+=arr[i];
        }
        return sum;
    }
}