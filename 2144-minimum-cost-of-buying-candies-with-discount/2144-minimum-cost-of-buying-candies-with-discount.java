class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int r=0;
        for(int i=cost.length-1;i>=0;i--){
            if((cost.length-1-i)%3!=2){
                r=r+cost[i];
            }
        }
        return r;
    }
}