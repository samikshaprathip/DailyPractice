class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // defensive checks
        if (nums == null || nums.length == 0) return nums;

        int m = nums.length;
        int n = nums[0].length;

        // if total elements don't match, return original
        if (m * n != r * c) return nums;

        int[][] ans = new int[r][c];

        // single normal for-loop mapping linear index -> source and target indices
        for (int i = 0; i < m * n; i++) {
            int srcRow = i / n;
            int srcCol = i % n;
            int tgtRow = i / c;
            int tgtCol = i % c;
            ans[tgtRow][tgtCol] = nums[srcRow][srcCol];
        }

        return ans;
    }

    // Helper to print matrix for testing
    private static void printMatrix(int[][] a) {
        if (a == null) return;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Test
    public static void main(String[] args) {
        MatrixReshape sol = new MatrixReshape();
        int[][] nums = {
                {1, 2},
                {3, 4}
        };
        int r = 1, c = 4;
        int[][] reshaped = sol.matrixReshape(nums, r, c);
        printMatrix(reshaped); // expected: 1 2 3 4
    }
}
