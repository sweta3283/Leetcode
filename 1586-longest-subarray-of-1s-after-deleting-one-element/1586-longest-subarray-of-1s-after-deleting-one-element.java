class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int countZero = 0;
        int max = 0;
        while (right < n) {
            if (nums[right] == 0) {
                countZero++;
            }
            while (left < n && countZero == 2) {
                if (nums[left] == 0) {
                    countZero--;
                }

                left++;
            }

            max = Math.max(max, right - left);
            System.out.println(right + " : " + left + " :max " + max);
            right++;
        }
        return max;
    }
}