package bab_06;

import java.util.ArrayList;

public class Contoh7TipeDataArrayList {

     public static void main(String[] args) {
        // Deklarasi array list dengan tipe data string
        ArrayList<String> namaPeserta = new ArrayList<String>();
        
        // Menambah elemen objek array list
        namaPeserta.add("Ayu");
        namaPeserta.add("Budi");
        namaPeserta.add("Citra");
        namaPeserta.add("Damar");
        namaPeserta.add("Emy");
        // Cetak array list
        System.out.println("Daftar peserta:");
        for (int i = 0; i < namaPeserta.size(); i++) {
            System.out.println(namaPeserta.get(i));
        }
    }
}