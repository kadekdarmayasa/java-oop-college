package kuis_01;

import java.util.Scanner;

public class Kuis1 {
    public static void main(String[] args) {
        final int JUMLAH_HARI = 7;

        // Inisialisasi array untuk menyimpan suhu
        double[] daftarSuhu = new double[JUMLAH_HARI];
        double suhu = 0;
        double totalSuhu = 0;
        double suhuTertinggi = Double.MIN_VALUE;
        double suhuTerendah = Double.MAX_VALUE;
        Scanner baca = new Scanner(System.in);

        // Input suhu dari pengguna
        for (int i = 0; i < JUMLAH_HARI; i++) {
            System.out.print("Masukkan suhu hari ke-" + (i + 1) + ": ");
            suhu = baca.nextDouble();
            daftarSuhu[i] = suhu;
            totalSuhu += suhu;
        }

        // Hitung suhu tertinggi dan terendah
        for (int i = 0; i < JUMLAH_HARI; i++) {
            if (daftarSuhu[i] > suhuTertinggi) {
                suhuTertinggi = daftarSuhu[i];
            }
            if (daftarSuhu[i] < suhuTerendah) {
                suhuTerendah = daftarSuhu[i];
            }
        }

        // Hitung rata-rata suhu
        double rataRataSuhu = totalSuhu / JUMLAH_HARI;

        baca.close();

        // Tampilkan hasil
        System.out.println("Suhu tertinggi: " + suhuTertinggi);
        System.out.println("Suhu terendah: " + suhuTerendah);
        System.out.println("Rata-rata suhu: " + rataRataSuhu);
    }
}
