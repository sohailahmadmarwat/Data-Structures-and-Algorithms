public class NegativeSumLargest {
    public static void main(String[] args) {
        int[][] matrix = {
            {-34, 56, 20, 33, -18},
            {89, 35, 67, -2, -54},
            {44, 42, 56, -76, 90},
            {-56, 78, -14, 79, 11}
        };
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Row-wise:");
        for (int i = 0; i < rows; i++) {
            int sumNeg = 0;
            int largestNeg = Integer.MIN_VALUE;
            boolean hasNeg = false;

            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < 0) {
                    sumNeg += matrix[i][j];
                    hasNeg = true;
                    if (matrix[i][j] > largestNeg) {
                        largestNeg = matrix[i][j];
                    }
                }
            }
            System.out.println("Row " + (i+1) + " -> Sum of negatives = " + sumNeg +
                               ", Largest negative = " + (hasNeg ? largestNeg : "None"));
        }
        System.out.println("\nColumn-wise:");
        for (int j = 0; j < cols; j++) {
            int sumNeg = 0;
            int largestNeg = Integer.MIN_VALUE;
            boolean hasNeg = false;

            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] < 0) {
                    sumNeg += matrix[i][j];
                    hasNeg = true;
                    if (matrix[i][j] > largestNeg) {
                        largestNeg = matrix[i][j];
                    }
                }
            }
            System.out.println("Column " + (j+1) + " -> Sum of negatives = " + sumNeg +
                               ", Largest negative = " + (hasNeg ? largestNeg : "None"));
        }
    }
}
