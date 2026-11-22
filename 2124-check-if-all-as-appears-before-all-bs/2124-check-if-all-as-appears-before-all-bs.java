class Solution {
    public boolean checkString(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                if(ch=='b') count=1;
            }
            else if(ch=='b'){
                count=1;
                st.push(ch);
            }else if(count>0 && ch=='a'){
                return false;
            }else{
                st.push(ch);
            }
        }
        return true;
    }
}