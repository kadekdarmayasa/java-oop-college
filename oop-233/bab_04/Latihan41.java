package bab_04;

import java.util.Scanner;

public class Latihan41 {
     public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan angka (1-7): ");
        int angka = scanner.nextInt();
        
        // Menggunakan switch case untuk menentukan nama hari
        switch (angka) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Nama Hari tidak valid");
                break;
        }
        
        // Menutup scanner
        scanner.close();
    }
}
