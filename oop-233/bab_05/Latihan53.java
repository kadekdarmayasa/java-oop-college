package bab_05;

public class Latihan53 {
    public static void main(String[] args) {
        // Menampilkan nama hari berdasarkan nomor perulangan
        for(int day = 1; day <= 7; day++) {
            switch(day) {
                case 1:
                    System.out.println("Senin");
                    break;
                case 2:
                    System.out.println("Selasa");
                    break;
                case 3:
                    System.out.println("Rabu");
                    break;
                case 4:
                    System.out.println("Kamis");
                    break;
                case 5:
                    System.out.println("Jumat");
                    break;
                case 6:
                    System.out.println("Sabtu");
                    break;
                case 7:
                    System.out.println("Minggu");
                    break;
            }
        }
    }
}
