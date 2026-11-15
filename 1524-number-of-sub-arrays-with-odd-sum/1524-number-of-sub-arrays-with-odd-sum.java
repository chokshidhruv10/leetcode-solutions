class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int M=(int)1e9+7;
        int[] prefixsum=new int[n];
        prefixsum[0]=arr[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        int count=0;
        int odd=0;
        int even=1;
        for(int i=0;i<n;i++){
            if(prefixsum[i]%2==0){
                count=(count+odd)%M;
                even++;
            }else{
                count=(count+even)%M;
                odd++;
            }
        }
        return count;
    }
}