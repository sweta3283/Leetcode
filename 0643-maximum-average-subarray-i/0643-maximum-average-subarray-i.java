class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (i - j + 1 == k) {
                double avg = sum / k;
                max = Math.max(max, avg);
                sum = sum - nums[j];
                j++;

            }
        }

        return max;
    }
}