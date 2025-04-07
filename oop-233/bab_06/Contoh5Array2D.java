package bab_06;

import java.util.Scanner;

public class Contoh5Array2D {
    public static void main(String[] args) {
        String[][] kontak = new String[5][2];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Input data kontak ke-" + (i + 1));
            for (int j = 0; j < 2; j++) {
                String cetak = j == 0 ? "Nama" : "No.HP";
                System.out.print("Masukan " + cetak + " : ");
                kontak[i][j] = input.nextLine();
            }
            System.out.println();
        }
        
        input.close();
        
        System.out.println("Menampilkan daftar kontak:");
        System.out.println("Nama\tNo. HP");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(kontak[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
