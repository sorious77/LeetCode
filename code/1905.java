class Solution {
    class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[][] findIslands(int[][] grid) {
        int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int n = grid.length;
        int m = grid[0].length;

        int[][] islands = new int[n][m];

        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && islands[i][j] == 0) {
                    Queue<Pair> q = new LinkedList<>();

                    q.offer(new Pair(j, i));
                    islands[i][j] = count;

                    while (!q.isEmpty()) {
                        Pair p = q.poll();

                        for (int k = 0; k < 4; k++) {
                            int nx = p.x + move[k][0];
                            int ny = p.y + move[k][1];

                            if (0 <= nx && nx < m && 0 <= ny && ny < n) {
                                if (grid[ny][nx] == 1 && islands[ny][nx] == 0) {
                                    q.offer(new Pair(nx, ny));
                                    islands[ny][nx] = count;
                                }
                            }
                        }
                    }

                    count += 1;
                }
            }
        }

        return islands;
    }
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        int n = grid1.length;
        int m = grid1[0].length;

        int[][] islands1 = findIslands(grid1);
        int[][] islands2 = findIslands(grid2);

        int answer = 0;

        boolean[] checkedIsland = new boolean[125001];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (islands2[i][j] != 0 && !checkedIsland[islands2[i][j]]) {
                    Queue<Pair> q = new LinkedList<>();

                    q.offer(new Pair(j, i));
                    visited[i][j] = true;

                    int island = islands2[i][j];

                    boolean isSubIsland = islands1[i][j] != 0;
                    while (!q.isEmpty() && isSubIsland) {
                        Pair p = q.poll();

                        for (int k = 0; k < 4; k++) {
                            int nx = p.x + move[k][0];
                            int ny = p.y + move[k][1];

                            if (0 <= nx && nx < m && 0 <= ny && ny < n) {
                                if (islands2[ny][nx] == island && !visited[ny][nx]) {
                                    if (islands1[ny][nx] == 0) {
                                        isSubIsland = false;
                                        break;
                                    }

                                    visited[ny][nx] = true;
                                    q.offer(new Pair(nx, ny));
                                }
                            }
                        }
                    }

                    if (isSubIsland) {
                        answer += 1;
                    }

                    checkedIsland[islands2[i][j]] = true;
                }
            }
        }

        return answer;
    }
    
    
}
