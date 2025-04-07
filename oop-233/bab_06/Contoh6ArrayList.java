package bab_06;

import java.util.ArrayList;

public class Contoh6ArrayList {
     public static void main(String[] args) {
        // Membuat objek array list
        ArrayList<Object> gudangData = new ArrayList<Object>();
        // Mengisi gudang data dengan 5 data
        gudangData.add(12);
        gudangData.add(12.5);
        gudangData.add("Lampu");
        gudangData.add("Lampu Kuning");
        gudangData.add(true);
        // Menampilkan isi dari gudang data
        System.out.println("Isi gudang data : " + gudangData);
        // Menghapus item dengan namanya
        gudangData.remove("Lampu");
        // Menampilkan isi terkini dari gudang data
        System.out.println("Isi terbaru gudang data : " + gudangData);
        // Menampilkan banyak isi objek gudang data
        System.out.println("Gudang data berisi : " + gudangData.size() + " data");
    }
}
