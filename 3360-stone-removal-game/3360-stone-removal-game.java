class Solution {
    public boolean canAliceWin(int n) {
        int remove=10;
        while(n>0){
            if(n<remove){
                return remove%2!=0;
            }
            n-=remove;
            remove--;
        }
        return remove%2!=0;
    }
}