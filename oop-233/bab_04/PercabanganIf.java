package bab_04;

import java.util.Scanner;

public class PercabanganIf {
    public static void main(String[] args) {
        //  Deklarasi Variabel
        int total;
        int disc = 0;
        Scanner baca = new Scanner(System.in);

        // Input total belanja
        System.out.print("Masukkan total belanja (Rp) : ");
        total = baca.nextInt();

        // Menutup Scanner
        baca.close();

        // Percabangan If untuk total belanja
        if(total >= 100000) {
            disc = total * 10 / 100;
            total -= disc;
        }

        System.out.println("Grand Total (Rp) : " + total);
        System.out.println("Total Diskon (Rp) : " + disc);
    }
}