class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int zero = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zero++;
            }
            if (zero <= k) {
                maxLen = Math.max(maxLen, right - left + 1);

            } else {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }
            right++;

        }
        return maxLen;
    }
}