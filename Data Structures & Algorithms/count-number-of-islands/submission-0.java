class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count += 1;
                    bfs(grid, i, j, q);
                }
            }
        }

        return count;
    }

    public void bfs(char[][] grid, int i, int j, Queue<int[]> q) {
        if (i < 0 || i > grid.length - 1 ||
            j < 0 || j > grid[0].length - 1 ||
            grid[i][j] == '0') {
            return;
        }

        q.offer(new int[]{i, j});
        grid[i][j] = '0';

        int[][] dirs = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < grid.length &&
                    nc >= 0 && nc < grid[0].length &&
                    grid[nr][nc] == '1') {

                    q.offer(new int[]{nr, nc});
                    grid[nr][nc] = '0';
                }
            }
        }
    }
}