package bab_04;

public class PercabanganBersarang2 {
    public static void main(String[] args) {
        boolean syaratIPK = true;
        boolean syaratNilai = false;

        // Cek predikat kelulusan
        if(syaratIPK == true) {
            if(syaratNilai == true) {
                System.out.println("Predikat kelulusan cum laude");
            } else {
                System.out.println("Predikat kelulusan sangat memuaskan");
            }
        } else {
            System.out.println("Predikat kelulusan sangat memuaskan");
        }
    }
}