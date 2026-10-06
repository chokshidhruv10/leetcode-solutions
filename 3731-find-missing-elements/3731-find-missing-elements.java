import java.util.*;
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Collections.sort(list);
        int n=list.size();
        int min=list.get(0);
        int max=list.get(n-1);
        for(int i=min;i<max;i++){
            if(!list.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}