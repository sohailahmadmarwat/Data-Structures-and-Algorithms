public class SumAboveBelowDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
            {34, 56, 20, 33, 18},
            {89, 35, 67, 23, 54},
            {67, 42, 56, 76, 90},
            {56, 78, 14, 79, 11}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int sumAbove = 0, sumBelow = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j > i) {
                    sumAbove += matrix[i][j];
                } else if (j < i) {
                    sumBelow += matrix[i][j];
                }
            }
        }

        System.out.println("Sum of elements above diagonal: " + sumAbove);
        System.out.println("Sum of elements below diagonal: " + sumBelow);
    }
}
