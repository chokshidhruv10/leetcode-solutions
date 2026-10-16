class Solution {
    public int[] sumZero(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        int size=0;
        for(int i=1;i<=n/2;i++){
            int positive=i;
            int negative=-positive;
            ans.add(positive);
            ans.add(negative);
            size=size+2;
        }
        if(n%2!=0){
            ans.add(0);
        }
        int[] Array = ans.stream().mapToInt(Integer::intValue).toArray();
        return Array;
    }
}