package bab_06;

import java.util.Scanner;


public class Contoh3ArrayNilaiMax {
    public static void main(String[] args) {
        // Deklarasi variabel array angka
        int[] angka;
        // Deklarasi variabel untuk panjang array
        int panjang;
        // Menentukan nilai awal index angka terbesar
        int idx = 0;
        // Deklarasi variabel input dengan scanner
        Scanner input = new Scanner(System.in);
        // Input panjang array
        System.out.print("Masukan panjang array : ");
        panjang = input.nextInt();
        // Membentuk variabel array angka baru
        // Panjang array sesuai input pengguna
        angka = new int[panjang];
        
        // Input nilai untuk elemen array
        for (int i = 0; i < panjang; i++) {
            System.out.print("Input angka ke-" + (i + 1) + " : ");
            angka[i] = input.nextInt();
        }
        input.close();
        
        // Mencari angka terbesar
        for (int j = 0; j < panjang; j++) {
            if (angka[j] > angka[idx]) {
                idx = j;
            }
        }
        
        // Cetak angka terbesar
        System.out.println("Angka terbesar adalah " + angka[idx] 
                + " yang berada pada index ke-" + idx);
    }
}
