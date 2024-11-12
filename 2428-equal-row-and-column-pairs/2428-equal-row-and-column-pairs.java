class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('_' + grid[i][j]);
            }
            String s = sb.toString();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append('_' + grid[j][i]);
            }
            String s = sb.toString();
            res = res + map.getOrDefault(s, 0);
        }

        return res;
    }
}