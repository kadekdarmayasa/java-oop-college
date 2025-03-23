package bab_03;

import java.util.Scanner;

public class Latihan31 {
    public static void main(String[] args) {
        // Deklarasi Variabel
        double lebar;
        double panjang;
        double luas;

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner baca = new Scanner(System.in);
        
        // Menampilkan pesan untuk meminta input panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        panjang = baca.nextDouble();
            
        // Menampilkan pesan untuk meminta input lebar
        System.out.print("Masukkan lebar persegi panjang: ");
        lebar = baca.nextDouble();
        
        // Menghitung luas persegi panjang
        luas = panjang * lebar;

        // Menutup Scanner
        baca.close();
        
        // Menampilkan hasil perhitungan
        System.out.println("Luas persegi panjang dengan panjang " + panjang + 
                        " dan lebar " + lebar + " adalah " + luas);
    }
}
