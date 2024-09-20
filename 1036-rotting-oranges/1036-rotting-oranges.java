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
        int max = 0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();
        int freshCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new Pair(i, j, 0));
                    visited[i][j] = 2;
                } else {
                    visited[i][j] = 1;
                }
                if ((grid[i][j] == 1)) {
                    freshCount++;
                }
            }
        }
        int time = 0;
        int count = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int row = p.row;
            int col = p.col;
            time = p.time;
            time = Math.max(max, time);
            int[][] adjList = { { row - 1, col }, { row, col + 1 }, { row + 1, col }, { row, col - 1 } };
            for (int[] adj : adjList) {
                int nr = adj[0];
                int nc = adj[1];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && visited[nr][nc] != 2 && grid[nr][nc] == 1) {
                    visited[nr][nc] = 2;
                    queue.offer(new Pair(nr, nc, time + 1));
                    count++;
                }
            }
        }
        if (freshCount != count) {
            return -1;
        }
        return time;
    }
}
