class Solution {
    public int maxOperations(int[] nums, int k) {
        int result = 0;
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] == k) {
                result++;
                l++;
                r--;
            } else if (k - nums[l] > nums[r]) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
}