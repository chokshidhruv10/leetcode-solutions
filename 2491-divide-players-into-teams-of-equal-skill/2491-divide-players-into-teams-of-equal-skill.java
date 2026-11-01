import java.util.*;
class Solution {
    public long dividePlayers(int[] skill) {
        int n=skill.length;
        int team=n/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+skill[i];
        }
        if(sum%team!=0){
            return -1;
        }
        int max=sum/team;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:skill){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        long finalsum=0;
        for(int num:skill){
            if(map.get(num)==0){
                continue;
            }
            int second=max-num;
            if(!map.containsKey(second) || map.get(second)==0){
                return -1;
            }
            map.put(num,map.get(num)-1);
            map.put(second,map.get(second)-1);
            long product=(long)num*second;
            finalsum=finalsum+product;
        }
        return finalsum;
    }
}