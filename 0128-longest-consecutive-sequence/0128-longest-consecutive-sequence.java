class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                int next=num+1;
                while(set.contains(next)){
                    count++;
                    next++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}