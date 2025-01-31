class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] column = new boolean[m];
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                if (matrix[a][b] == 0) {
                    row[a] = true;
                    column[b] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                   // System.out.println(i + " : " + j);
                }
            }
        }
    }
}