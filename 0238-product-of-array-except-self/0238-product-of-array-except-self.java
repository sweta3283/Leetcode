class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int right = 1;
        arr[0] = nums[0];
        int left = 1;
        while (left <= n - 1) {
            arr[left] = arr[left - 1] * nums[left];
            left++;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = right * arr[i - 1];
            right = right * nums[i];
        }
        arr[0] = right;
        return arr;
    }
}