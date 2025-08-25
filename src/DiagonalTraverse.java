public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];

        int row = 0, col = 0, dir = 1;
        int idx = 0;

        while (idx < m * n) {
            result[idx++] = mat[row][col];

            if (dir == 1) { // up-right
                if (col == n - 1) {
                    row++; dir = -1;
                } else if (row == 0) {
                    col++; dir = -1;
                } else {
                    row--; col++;
                }
            } else { // down-left
                if (row == m - 1) {
                    col++; dir = 1;
                } else if (col == 0) {
                    row++; dir = 1;
                } else {
                    row++; col--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        DiagonalTraverse dt = new DiagonalTraverse();
        int[] result = dt.findDiagonalOrder(mat);

        System.out.print("Diagonal Traverse: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
