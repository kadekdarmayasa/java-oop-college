package bab_03;

import java.util.Scanner;

public class Latihan32 {
    public static void main(String[] args) {
        // Mendefinisikan nilai PI sebagai konstanta
        final double PI = 3.14159;
        
        // Deklarasi variabel
        double jariJari;
        double keliling;
        Scanner scanner;
        
        // Assignment (pemberian nilai) pada variabel
        scanner = new Scanner(System.in);
        
        // Menampilkan pesan untuk meminta input jari-jari
        System.out.print("Masukkan jari-jari lingkaran: ");
        jariJari = scanner.nextDouble();
        
        // Menghitung keliling lingkaran dengan rumus 2 * PI * r
        keliling = 2 * PI * jariJari;

        // Menutup Scanner
        scanner.close();
        
        // Menampilkan hasil perhitungan
        System.out.println("Keliling lingkaran dengan jari-jari " + jariJari + 
                           " adalah " + keliling); 
    }
}
