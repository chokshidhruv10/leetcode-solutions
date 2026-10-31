class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int sum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=nums[i]-min;
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
}