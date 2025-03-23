package bab_03;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        // Deklarasi Variabel
        double luas;
        int alas, tinggi;

        // Membuat scanner baru untuk input dari pengguna
        Scanner baca = new Scanner(System.in);

        // Input nilai
        System.out.println("+= Hitung Luas Segitiga =+");
        System.out.print("Input panjang alas = ");
        alas = baca.nextInt();
        System.out.print("Input tinggi  = ");
        tinggi = baca.nextInt();

        // Menutup scanner baca
        baca.close();

        // Proses perhitungan
        luas = Double.valueOf(alas * tinggi) / 2;
        // Output hasil
        System.out.println("Luas = " + luas);
    }
}
