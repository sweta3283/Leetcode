class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        List<Double> list = new ArrayList<>();
        while (l <= r) {
            double avg = (nums[l] + nums[r]) / 2.0;
            list.add(avg);
            l++;
            r--;
        }
        double min = Double.MAX_VALUE;
        for (double num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}