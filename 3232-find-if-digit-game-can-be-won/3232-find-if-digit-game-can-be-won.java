class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        for(int num:nums){
            if(num<10){
                sum=sum+num;
            }else{
                sum=sum-num;
            }
        }
        return sum!=0;
    }
}