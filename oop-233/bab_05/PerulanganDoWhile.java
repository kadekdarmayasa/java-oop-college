package bab_05;

import java.util.Scanner;

public class PerulanganDoWhile {
    public static void main(String[] args) {
        boolean stop = true;
        int jumlahPerulangan = 0;
        String jawab;
        Scanner baca = new Scanner(System.in);

        // Perulangan DO-WHILE
        do {
            jumlahPerulangan++;
            System.out.println("Ini adalah perulangan ke-" + jumlahPerulangan);
            System.out.print("Apakah anda ingin keluar? (ya|tidak) : ");
            jawab = baca.nextLine();

            if(jawab.equalsIgnoreCase("ya")) {
                stop = true;
            } else if(jawab.equalsIgnoreCase("tidak")) {
                stop = false;
            }
        } while (stop == false);

        baca.close();

        System.out.println("Anda telah melakukan perulangan sebanyak " + jumlahPerulangan);
    }
}
