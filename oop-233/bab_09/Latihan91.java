package bab_09;

 class Buku {
    // Atribut private (encapsulation)
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    
    // Getter methods
    public String getJudul() {
        return judul;
    }
    
    public String getPengarang() {
        return pengarang;
    }
    
    public String getPenerbit() {
        return penerbit;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    // Setter methods dengan validasi
    public void setJudul(String judul) {
        if (judul != null && !judul.trim().isEmpty()) {
            this.judul = judul;
        } else {
            System.out.println("Judul tidak boleh kosong!");
        }
    }
    
    public void setPengarang(String pengarang) {
        if (pengarang != null && !pengarang.trim().isEmpty()) {
            this.pengarang = pengarang;
        } else {
            System.out.println("Pengarang tidak boleh kosong!");
        }
    }
    
    public void setPenerbit(String penerbit) {
        if (penerbit != null && !penerbit.trim().isEmpty()) {
            this.penerbit = penerbit;
        } else {
            System.out.println("Penerbit tidak boleh kosong!");
        }
    }
    
    public void setTahunTerbit(int tahunTerbit) {
        if (tahunTerbit > 0 && tahunTerbit <= 2024) {
            this.tahunTerbit = tahunTerbit;
        } else {
            System.out.println("Tahun terbit tidak valid!");
        }
    }
    
    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("=== Informasi Buku ===");
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("========================");
    }
}

// Class untuk testing
public class Latihan91 {
    public static void main(String[] args) {
        // Membuat objek buku menggunakan constructor default
        Buku buku = new Buku();
        
        // Menggunakan setter methods
        buku.setJudul("Harry Potter and the Sorcerer's Stone");
        buku.setPengarang("J.K. Rowling");
        buku.setPenerbit("Scholastic");
        buku.setTahunTerbit(1997);
        
        // Menampilkan informasi buku
        buku.tampilkanInfo();
    }
}