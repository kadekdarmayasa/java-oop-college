package bab_06;

public class Contoh4Array2D {
    public static void main(String[] args) {
        int[][] matrix = { 
            { 3, 6, 4, 5 }, 
            { 1, 3, 2, 6 }, 
            { 9, 3, 6, 5 } 
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
