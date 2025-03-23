package bab_03;

import java.util.Scanner;

public class OperatorPembanding {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka1, angka2;
        boolean hasil;
        Scanner baca = new Scanner(System.in);

        // Input angka
        System.out.print("Input angka-1 : ");
        angka1 = baca.nextInt();
        System.out.print("Input angka-2 : ");
        angka2 = baca.nextInt();

        // Menutup scanner
        baca.close();

        // Apakah angka-1 > angka-2?
        hasil = angka1 > angka2;
        System.out.println("angka-1 > angka-2? : " + hasil);

        // Apakah angka-1 < angka-2?
        hasil = angka1 < angka2;
        System.out.println("angka-1 < angka-2? : " + hasil);
    }
}
