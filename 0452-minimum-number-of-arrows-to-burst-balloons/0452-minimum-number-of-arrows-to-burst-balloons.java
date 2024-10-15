class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int n = points.length;
        int count = 1;
        int prev = 0;
        for (int i = 1; i < n; i++) {
            if (points[i][0] > points[prev][1]) {
                count++;
                prev = i;
            }
        }
        return count;
    }
}