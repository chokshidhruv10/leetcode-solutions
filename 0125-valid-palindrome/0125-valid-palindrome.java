class Solution {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr=str.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        String result=new String(arr);
        if(str.equals(result)){
            return true;
        }
        return false;
    }
}