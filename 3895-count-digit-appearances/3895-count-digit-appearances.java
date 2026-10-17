import java.util.*;
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                int ans=nums[i]%10;
                list.add(ans);
                nums[i]=nums[i]/10;
            }
        }
        int count=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==digit){
                count++;
            }
        }
        return count;
    }
}