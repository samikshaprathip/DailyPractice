class Solution {
    private final int[][] DIRS = { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) {
            return result;
        }
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] reachableP = new boolean[m][n];
        boolean[][] reachableA = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            dfs(heights, i, 0, reachableP, Integer.MIN_VALUE);
            dfs(heights, i, n - 1, reachableA, Integer.MIN_VALUE);
        }
        for (int j = 0; j < n; j++) {
            dfs(heights, 0, j, reachableP, Integer.MIN_VALUE);
            dfs(heights, m - 1, j, reachableA, Integer.MIN_VALUE);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (reachableP[i][j] && reachableA[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }
    private void dfs(int[][] heights, int i, int j, boolean[][] visited, int prevHeight) {
        int m = heights.length;
        int n = heights[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n) {
            return;
        }
        if (visited[i][j]) {
            return;
        }
        if (heights[i][j] < prevHeight) {
            return;
        }
        visited[i][j] = true;
        for (int[] d : DIRS) {
            int ni = i + d[0];
            int nj = j + d[1];
            dfs(heights, ni, nj, visited, heights[i][j]);
        }
    }
}
