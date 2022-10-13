class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;

        String[] cols = new String[n];
        String[] rows = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder col = new StringBuilder();
            StringBuilder row = new StringBuilder();

            for (int j = 0; j < n; j++) {
                row.append(grid[i][j]).append(" ");
                col.append(grid[j][i]).append(" ");
            }

            cols[i] = col.toString();
            rows[i] = row.toString();
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cols[i].equals(rows[j])) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}
