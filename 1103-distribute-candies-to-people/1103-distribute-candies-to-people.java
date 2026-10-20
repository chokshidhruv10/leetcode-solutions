class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        int give = 1;
        while (candies > 0) {
            int index = i % num_people;
            ans[index] = ans[index] + Math.min(give, candies);
            candies = candies - Math.min(give, candies);
            give++;
            i++;
        }
        return ans;
    }
}
