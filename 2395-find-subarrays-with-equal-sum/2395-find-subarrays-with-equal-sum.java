class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(j-i+1==2){
                    if(set.contains(sum)){
                        return true;
                    }
                    set.add(sum);
                    break;
                }
            }
        }
        return false;
    }
}