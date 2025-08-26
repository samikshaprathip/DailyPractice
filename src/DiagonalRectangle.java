public class DiagonalRectangle {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonal = 0;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int width = dimensions[i][0];
            int height = dimensions[i][1];

            int diagonalSq = width * width + height * height;
            int area = width * height;

            if (diagonalSq > maxDiagonal) {
                maxDiagonal = diagonalSq;
                maxArea = area;
            } else if (diagonalSq == maxDiagonal && area > maxArea) {
                maxArea = area;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        DiagonalRectangle sol = new DiagonalRectangle();

        int[][] dimensions1 = {{9, 3}, {8, 6}};
        int[][] dimensions2 = {{3, 4}, {6, 8}, {5, 12}};
        int[][] dimensions3 = {{1, 1}, {2, 2}, {3, 3}};

        System.out.println(sol.areaOfMaxDiagonal(dimensions1));
        System.out.println(sol.areaOfMaxDiagonal(dimensions2));
        System.out.println(sol.areaOfMaxDiagonal(dimensions3));
    }
}
