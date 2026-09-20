class Solution {
    public int reverseDegree(String s) {
        int reverse=0;
        for(int i=0;i<s.length();i++){
            reverse=reverse+('z'- s.charAt(i)+1)*(i+1);
        }
        return reverse;
    }
}