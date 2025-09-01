class MatrixSum {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;   // size of the matrix (n x n)
        int ans = 0;

        // Traverse rows
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element (row == column)
            ans += mat[i][i];

            // Add secondary diagonal element (row + column == n-1)
            ans += mat[i][n - 1 - i];
        }

        // If n is odd, the center element was added twice
        // so subtract it once
        if (n % 2 != 0) {
            ans -= mat[n / 2][n / 2];
        }

        return ans;
    }

    // For testing
    public static void main(String[] args) {
        MatrixSum sol = new MatrixSum();

        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] mat2 = {
                {5}
        };

        System.out.println(sol.diagonalSum(mat1)); // Expected: 25 (1+5+9 + 3+5+7 = 30, center 5 counted twice → 25)
        System.out.println(sol.diagonalSum(mat2)); // Expected: 5
    }
}
