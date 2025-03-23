package bab_03;

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        Scanner baca = new Scanner(System.in);

        // Input angka
        System.out.print("Input angka-1 : ");
        angka1 = baca.nextInt();
        System.out.print("Input angka-2 : ");
        angka2 = baca.nextInt();

        // Menutup scanner
        baca.close();

        // Operasi penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan : " + hasil);

        // Operasi pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan : " + hasil);
        
        // Operasi perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil perkalian : " + hasil);

        // Operasi pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil pembagian : " + hasil);
        
        // Operasi sisa bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil sisa bagi : " + hasil);
    }
}
