class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int h = height.length - 1;
        while (l < h) {
            int area = Math.min(height[l], height[h]) * (h - l);
            max = Math.max(max, area);
            if (height[l] < height[h]) {
                l++;
            } else {
                h--;
            }
        }
        return max;
    }
}