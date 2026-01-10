class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMin = new int[m];
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        int[] colMax = new int[n];
        List<Integer> list = new ArrayList<>(m);
        for (int i = 0; i < m; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < n; j++) {
                int el = row[j];
                if (el < rowMin[i]) {
                    rowMin[i] = el;
                }
                if (el > colMax[j]) {
                    colMax[j] = el;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
}