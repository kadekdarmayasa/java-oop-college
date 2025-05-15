package soal1;

public class Soal1 {
    public static void main(String[] args) {
        // Initialisasi array mahasiswa dengan 10 elemen
        Mahasiswa[] mahasiswa = new Mahasiswa[10];

        // Mengisi array mahasiswa dengan objek Mahasiswa
        mahasiswa[0] = new Mahasiswa("Andi", "123456789", "Sistem Informasi", 3.6);
        mahasiswa[1] = new Mahasiswa("Budi", "987654321", "Sistem Komputer", 3.7);
        mahasiswa[2] = new Mahasiswa("Cindy", "456789123", "Teknologi Informasi", 3.8);
        mahasiswa[3] = new Mahasiswa("Diana", "321654987", "Sistem Informasi", 3.6);
        mahasiswa[4] = new Mahasiswa("Eko", "654321789", "Sistem Komputer", 3.9);
        mahasiswa[5] = new Mahasiswa("Fani", "789123456", "Teknologi Informasi", 3.4);
        mahasiswa[6] = new Mahasiswa("Darma", "159753486", "Sistem Informasi", 4.0);
        mahasiswa[7] = new Mahasiswa("Hadi", "753159486", "Sistem Komputer", 3.1);
        mahasiswa[8] = new Mahasiswa("Ika", "951753486", "Teknologi Informasi", 3.0);
        mahasiswa[9] = new Mahasiswa("Joko", "258963147", "Sistem Informasi", 3.7);


        // Jumlah mahasiswa dengan nilai IPK di atas 3.5 untuk setiap prodi
        int totalSI = 0;
        int totalSK = 0;
        int totalTI = 0;

        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i].ipk > 3.5) {
                if (mahasiswa[i].prodi.equals("Sistem Informasi")) {
                    totalSI++;
                } else if (mahasiswa[i].prodi.equals("Sistem Komputer")) {
                    totalSK++;
                } else if (mahasiswa[i].prodi.equals("Teknologi Informasi")) {
                    totalTI++;
                }
            }
        }

        // Menampilkan hasil
        System.out.println("Jumlah mahasiswa dengan IPK di atas 3.5:");
        System.out.println("Sistem Informasi: " + totalSI);
        System.out.println("Sistem Komputer: " + totalSK);
        System.out.println("Teknologi Informasi: " + totalTI);
    }
}
