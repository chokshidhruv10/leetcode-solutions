class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        if(top-(bottom-1)==special.length)return 0;
        Arrays.sort(special);
        int ans = 0;
        int last_value = bottom-1;
        for(int i = 0;i<special.length;i++){
            int diff = (special[i]-1)-last_value;
            ans = Math.max(ans,diff);
            last_value = special[i];
        }
        ans = Math.max(ans,top-last_value);
        return ans;
    }
}