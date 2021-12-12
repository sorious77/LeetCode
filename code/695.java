class Solution {
    class Pair {
        int x, y;

        Pair() {}
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int getArea(int[][] grid, int x, int y) {
        grid[y][x] = 0;

        int m = grid.length;
        int n = grid[0].length;

        int area = 1;

        if(0 <= x - 1 && grid[y][x - 1] == 1) {
            area += getArea(grid, x - 1, y);
        }

        if(x + 1 < n && grid[y][x + 1] == 1) {
            area += getArea(grid, x + 1, y);
        }

        if(0 <= y - 1 && grid[y - 1][x] == 1) {
            area += getArea(grid, x, y - 1);
        }

        if(y + 1 < m && grid[y + 1][x] == 1) {
            area += getArea(grid, x, y + 1);
        }

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int answer = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    answer = Math.max(getArea(grid, j, i), answer);
                }
            }
        }

        return answer;
    }
}