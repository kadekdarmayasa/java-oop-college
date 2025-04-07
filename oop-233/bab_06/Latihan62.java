package bab_06;

import java.util.Scanner;

public class Latihan62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[5][4];
        int[] jumlahBaris = new int[5];
        
        System.out.println("Program Matrix 5x4");
        System.out.println("==================");
        
        // Input nilai matrix
        for (int i = 0; i < 5; i++) {
            System.out.println("Input nilai untuk baris ke-" + (i+1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Kolom " + (j+1) + ": ");
                matrix[i][j] = input.nextInt();
                jumlahBaris[i] += matrix[i][j];
            }
            System.out.println();
        }
        
        // Tampilkan matrix
        System.out.println("Matrix yang dimasukkan:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        // Tampilkan jumlah setiap baris
        System.out.println("\nJumlah nilai setiap baris:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Baris ke-" + (i+1) + ": " + jumlahBaris[i]);
        }
        
        input.close();
    }
}
