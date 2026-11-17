class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String temp=strs[i];
            char[] ch=temp.toCharArray();
            Arrays.sort(ch);
            String sort=new String(ch);
            if(!map.containsKey(sort)){
                map.put(sort,new ArrayList<>());
            }
            map.get(sort).add(temp);
        }
        return new ArrayList<>(map.values());
    }
}