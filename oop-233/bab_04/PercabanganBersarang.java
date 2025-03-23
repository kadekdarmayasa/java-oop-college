package bab_04;

import java.util.Scanner;

public class PercabanganBersarang {
    public static void main(String[] args) {
        // Deklarasi variabel
        int total, diskon, bayar;
        String member;
        String voucher;
        Scanner baca = new Scanner(System.in);

        // Input data
        System.out.print("Apakah anda punya kartu member? (ya|tidak) : ");
        member = baca.nextLine();

        System.out.print("Apakah anda memiliki voucher? (ya|tidak) : ");
        voucher = baca.nextLine();

        System.out.print("Masukkan total belanja (Rp) : ");
        total = baca.nextInt();

        // Menutup scanner
        baca.close();

        // Percabangan bersarang
        if(member.equalsIgnoreCase("ya")) {
            if(total > 500000) {
                diskon = 15;
            } else if(total > 100000) {
                diskon = 10;
            } else {
                diskon = 0;
            }
        } else {
            if(total > 100000) {
                diskon = 5;
            } else {
                diskon = 0;
            }
        }

        // Proses pembayaran 
        bayar = total - (total * diskon) / 100;

        if(voucher.equalsIgnoreCase("ya")) {
            bayar = bayar - (bayar * 50) / 100;
        }

        // Keluaran total pembayaran
        System.out.println("Total pembayaran (Rp) : " + bayar);
    }
}
