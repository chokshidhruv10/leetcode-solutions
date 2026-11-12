class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           map.put(ch,i);
        }
        ArrayList<Integer> list=new ArrayList<>();
        int start=0;
        int value=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            value=Math.max(value,map.get(ch));
            if(i==value){
                list.add(value-start+1);
                start=value+1;
            }
        }
        return list;
    }
}