class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:words){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else{
                map.put(s,1);
            }
        }
         PriorityQueue<String> minheap = new PriorityQueue<>((a,b) -> {
            if(map.get(a).equals(map.get(b))) {
                return b.compareTo(a);
            }
            return map.get(a)-map.get(b);
        });
        for(String key:map.keySet()){
            minheap.add(key);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        List<String> ans=new ArrayList<>();
        while(!minheap.isEmpty()){
            ans.add(minheap.poll());
        }
        Collections.reverse(ans);
        return ans;
    }
}