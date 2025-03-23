package bab_04;

import java.util.Scanner;

public class PercabanganIfElse {
    public static void main(String[] args) {
        // Deklarasi Variabel
        String nama;
        float nilai;
        Scanner baca = new Scanner(System.in);

        // Input Data
        System.out.print("Masukkan nama anda : ");
        nama = baca.nextLine();

        System.out.print("Masukkan nilai anda : ");
        nilai = baca.nextFloat();

        // Menutup Scanner
        baca.close();

        if(nilai > 70) {
            System.out.println("Selamat " + nama + ", anda lulus dengan nilai " + nilai);
        } else {
            System.out.println("Maaf " + nama + ", anda gagal. Silahkan ulangi kembali!");
        }
    }
}
