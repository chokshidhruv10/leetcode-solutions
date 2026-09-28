class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            int num=n;
            int reverse=0;
            int original=num;
            while(num>0){
                int digit=num%i;
                reverse=(reverse*i)+digit;
                num=num/10;
            }
            if(original!=reverse){
                return false;
            }
        }
        return true;
    }
}