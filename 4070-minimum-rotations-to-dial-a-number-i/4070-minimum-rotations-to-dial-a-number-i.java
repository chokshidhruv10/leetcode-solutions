class Solution {
    public int minRotations(String s) {
        int res=Math.min(s.charAt(0)-'0',10-(s.charAt(0)-'0'));
        for(int i=0;i<s.length()-1;i++){
            int x=Math.min(s.charAt(i),s.charAt(i+1));
            int y=Math.max(s.charAt(i),s.charAt(i+1));
            res=res+Math.min(y-x,x+10-y);
        }
        return res;
    }
}