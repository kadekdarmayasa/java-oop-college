package bab_04;

public class OperatorLogikaPercabangan {
    public static void main(String[] args) {
        boolean syaratIPK = true;
        boolean syaratNilai = true;

        // Cek predikat kelulusan
        if(syaratIPK == true || syaratNilai == true) {
            System.out.println("Predikat kelulusan cum laude");
        } else {
            System.out.println("Predikat kelulusan sangat memuaskan");
        }
    }
}
