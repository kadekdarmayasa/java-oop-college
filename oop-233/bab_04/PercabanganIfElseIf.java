package bab_04;

import java.util.Scanner;

public class PercabanganIfElseIf {
    public static void main(String[] args) {
        // Deklarasi variabel
        String nama;
        float nilai;
        char grade;
        Scanner baca =  new Scanner(System.in);

        // Input data
        System.out.print("Masukkan nama anda : ");
        nama = baca.nextLine();

        System.out.print("Masukkan nilai anda : ");
        nilai = baca.nextFloat();

        // Menutup scanner
        baca.close();

        if(nilai > 85) {
            grade = 'A';
        } else if(nilai > 75) {
            grade = 'B';
        } else if(nilai > 60) { 
            grade = 'C';
        } else if(nilai > 45) {
            grade = 'D';
        } else {
            grade = 'E';
        }


        System.out.println("Hallo " + nama);
        System.out.println("Grade nilai anda adalah " + grade);
    }
}
