public class MatrixMinMax {
    public static void main(String[] args) {
        int[][] matrix = {
            {34, 56, 20, 33, 18},
            {89, 35, 67, 23, 54},
            {67, 42, 56, 76, 90},
            {56, 78, 14, 79, 11}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Max in each row.....");
        for (int i = 0; i < rows; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println(max);
        }
        System.out.print("\nMin in each column.....\n");
        for (int j = 0; j < cols; j++) {
            int min = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            System.out.print(min + "   ");
        }
    }
}
