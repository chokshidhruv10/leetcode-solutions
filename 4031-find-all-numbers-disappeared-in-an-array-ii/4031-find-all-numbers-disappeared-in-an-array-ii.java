class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        ArrayList<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        int count=0;
        for(int i=0;i<list.size();i=i+count){
            int start=list.get(i);
            int end=start;
            count=1;
            for(int j=i;j<list.size()-1;j++){
                if(list.get(j)+1==list.get(j+1)){
                    end=list.get(j+1);
                    count++;
                }else{
                    break;
                }
            }
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);
        }
        return ans;
    }
}