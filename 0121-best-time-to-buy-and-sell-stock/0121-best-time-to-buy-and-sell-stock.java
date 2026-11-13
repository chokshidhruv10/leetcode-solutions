class Solution {
    public int maxProfit(int[] prices) {
        int buyprice=prices[0];
        int currentprofit=0;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                buyprice=prices[i];
                currentprofit=0;
            }else if(prices[i]>buyprice){
                currentprofit=prices[i]-buyprice;
                maxprofit=Math.max(currentprofit,maxprofit);
            }
        }
        return maxprofit;
    }
}