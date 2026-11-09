class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<String> list=new ArrayList<>(Arrays.asList(words));
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(list.get(i).contains(String.valueOf(x))){
                ans.add(i);
            }
        }
        return ans;
    }
}