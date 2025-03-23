package bab_05;

import java.util.Scanner;

public class PerulanganWhileDo {
    public static void main(String[] args) {
        boolean stop = false;
        int jumlahPerulangan = 0;
        String jawab;
        Scanner baca = new Scanner(System.in);

        // Perulangan WHILE-DO
        while(stop == false) {
            jumlahPerulangan++;
            System.out.println("Ini adalah perulangan ke-" + jumlahPerulangan);
            System.out.print("Apakah anda ingin keluar? (ya|tidak) : ");
            jawab = baca.nextLine();
            if(jawab.equalsIgnoreCase("ya")) {
                stop = true;
            }
        }

        baca.close();
        System.out.println("Anda telah melakukan perulangan sebanyak " + jumlahPerulangan);
    }
}
