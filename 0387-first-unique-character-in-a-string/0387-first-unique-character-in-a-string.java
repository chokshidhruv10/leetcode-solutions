import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        char[] arr=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return i;
            }
        }
        return -1;
    }
}