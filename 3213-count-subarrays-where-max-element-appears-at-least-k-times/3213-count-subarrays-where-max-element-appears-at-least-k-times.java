class Solution {
    public long countSubarrays(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        long count = 0;
        long result = 0;
        long l = 0;
        long r = 0;
        while (r < nums.length || l > r) {
            if (nums[(int) r] == max) {
                count++;
            }

            while (count >= k) {
                if (nums[(int) l] == max) {
                    count--;
                }
                result = result + nums.length - r;
                l++;
            }
            r++;
        }
        return result;
    }
}