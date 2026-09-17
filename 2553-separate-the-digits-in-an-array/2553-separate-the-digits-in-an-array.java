class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder str = new StringBuilder();
        for (int num : nums) {
            str.append(num);
        }
        int[] ans = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ans[i] = str.charAt(i) - '0';
        }
        return ans;
    }
}