import java.util.*;
class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int[] s=new int[n];
        for(int i=1;i<=n;i++){
            s[i-1]=i;
        }
        int j=0;
        for(int i=0;i<n && j<target.length;i++){
            st.push(s[i]);
            ans.add("Push");
            if(s[i]==target[j]){
                j++;
            }else{
                st.pop();
                ans.add("Pop");
            }
        }
        return ans;
    }
}