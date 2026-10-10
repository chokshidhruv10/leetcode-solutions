class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int max = 0;
        long k = (long) k1 + k2;

        int[] d = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            d[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, d[i]);
        }

        int[] freq = new int[max + 1];

        for (int x : d) {
            freq[x]++;
        }

        for (int i = max; i > 0 && k > 0; i--) {
            if (freq[i] == 0) {
                continue;
            }

            if (k >= freq[i]) {
                k -= freq[i];
                freq[i - 1] += freq[i];
                freq[i] = 0;
            } else {
                freq[i - 1] += (int) k;
                freq[i] -= (int) k;
                k = 0;
            }
        }

        long ans = 0;

        for (int i = 1; i < freq.length; i++) {
            ans += (long) i * i * freq[i];
        }

        return ans;
    }
}