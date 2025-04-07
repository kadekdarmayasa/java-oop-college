package bab_06;

public class Contoh2Array1D {
    public static void main(String[] args) {
        // Deklarasi array dimensi satu dengan ukuran 5
        String[] namaPeserta = new String[5];
        
        // Mengisi nilai dari setiap elemen array
        namaPeserta[0] = "Ayu";
        namaPeserta[1] = "Budi";
        namaPeserta[2] = "Citra";
        namaPeserta[3] = "Damar";
        namaPeserta[4] = "Emy";
        
        // Menampilkan nilai setiap elemen array
        System.out.println("Daftar Peserta:");
        for(String nama : namaPeserta) {
            System.out.println(nama);
        }    
    }
}
