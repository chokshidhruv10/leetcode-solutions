class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count =0;
        for(int num:arr){
            if(num%2==0)count=0;
            if(num%2==1)count++;
            if(count==3)return true;
        }
        return false;
  }
}