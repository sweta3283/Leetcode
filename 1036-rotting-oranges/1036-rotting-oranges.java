class Solution {
    class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int[][] visited = new int[n][m];
        int freshCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 1;
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        int max = 0;
        int count = 0;
        int time = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int ro = p.row;
            int co = p.col;
            time = p.time;
            time = Math.max(max, time);
            int[][] neighbours = { { ro - 1, co }, { ro, co + 1 }, { ro + 1, co }, { ro, co - 1 } };
            for (int[] neighbour : neighbours) {
                int nr = neighbour[0];
                int nc = neighbour[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1
                        && visited[nr][nc] != 2) {
                    queue.offer(new Pair(nr, nc, time + 1));
                    visited[nr][nc] = 2;
                    count++;
                }
            }
        }
        if (count != freshCount) {
            return -1;
        }
        return time;
    }
}
