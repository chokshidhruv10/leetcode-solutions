class Solution {
    public int nonSpecialCount(int l, int r) {
        int special=0;
        for(int i=2;i*i<=r;i++){
            if(isprime(i)){
                int square=i*i;
                if(square>=l && square<=r){
                    special++;
                }
            }
        }
        return (r-l+1)-special;
    }
    public boolean isprime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}