class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int maxlength=0;
        for(right=0;right<fruits.length;right++){
            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.get(fruits[right])+1);
            }else{
                map.put(fruits[right],1);
            }
            while(map.size()>2){
                int fruitcount=map.get(fruits[left]);
                if(fruitcount==1){
                    map.remove(fruits[left]);
                }else{
                    map.put(fruits[left],fruitcount-1);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}