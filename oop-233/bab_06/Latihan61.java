package bab_06;

import java.util.Scanner;

public class Latihan61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[5];
        int total = 0;
        
        System.out.println("Program Menghitung Rata-rata");
        System.out.println("============================");
        
        // Input 5 angka dari pengguna
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i];
        }
        
        // Hitung rata-rata
        double rataRata = (double) total / 5;
        
        // Tampilkan hasil
        System.out.println("\nAngka yang dimasukkan:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Angka ke-" + (i+1) + ": " + angka[i]);
        }
        
        System.out.println("\nTotal: " + total);
        System.out.println("Rata-rata: " + rataRata);
        
        input.close();
    }
}
