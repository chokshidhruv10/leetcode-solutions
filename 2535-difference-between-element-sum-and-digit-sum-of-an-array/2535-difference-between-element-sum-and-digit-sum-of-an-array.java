class Solution {
    public int differenceOfSum(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1=sum1+nums[i];
        }
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int digit=nums[i]%10;
                list.add(digit);
                nums[i]=nums[i]/10;
            }
        }
        for(int i=0;i<list.size();i++){
            sum2=sum2+list.get(i);
        }
        return Math.abs(sum1-sum2);
    }
}