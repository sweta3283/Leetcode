class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int pivot = (end + start) / 2;
            if (target == nums[pivot]) {
                return pivot;
            }
            if (nums[start] <= nums[pivot]) {
                if (target >= nums[start] && target < nums[pivot]) {
                    end = pivot - 1;
                } else
                    start = pivot + 1;
            } else {
                if (target <= nums[end] && target > nums[pivot]) {
                    start = pivot + 1;
                } else
                    end = pivot - 1;

            }
        }
        return -1;
    }
}