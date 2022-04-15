package Arrays;

public class MultiplicationOfTwoMatrices {
    public static void main(String[] args) {
        int r1 = 2, c1 = 2;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {1,2}, {1,2} };
        int[][] secondMatrix = { {1,2}, {1,2} , {1,2}};

        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }

        System.out.println("Multiplication of two matrices is: ");
        for(int[] column : product) {
            for (int row : column) {
                System.out.print(row + "    ");
            }
            System.out.println();
        }
    }
}
