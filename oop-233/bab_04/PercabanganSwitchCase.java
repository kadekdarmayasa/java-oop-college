package bab_04;

import java.util.Scanner;

public class PercabanganSwitchCase {
    public static void main(String[] args) {
        // Deklarasi variabel
        String warnaLampu;
        Scanner baca = new Scanner(System.in);

        // Input baca
        System.out.print("Masukkan warna lampu (merah/kuning/hijau) : ");
        warnaLampu = baca.nextLine();

        // Menutup scanner
        baca.close();

        // Percabangan SWICTH/CASE
        switch(warnaLampu) {
            case "merah":
                System.out.println("Lampu merah, silahkan berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap berhati-hati");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Warna lampu tidak dikenali");
        }
    }
}
