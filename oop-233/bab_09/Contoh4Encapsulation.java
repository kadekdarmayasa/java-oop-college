package bab_09;


class PersegiPanjang {
    private double panjang, lebar;

    public void setPanjang(double p) {
        if(p > 0) {
            this.panjang = p;
            System.out.println("Nilai panjang = " + this.panjang);
        } else {
            System.out.println("Nilai panjang tidak boleh negatif");
        }
    }

    public void setLebar(double l) {
        if(l > 0) {
            this.lebar = l;
            System.out.println("Nilai lebar = " + this.lebar);
        } else {
            System.out.println("Nilai lebar tidak boleh negatif");
        }
    }

    public double getPanjang() {
        return this.panjang;
    }

    public double getLebar() {
        return this.lebar;
    }

    public double getLuas() {
        return this.panjang * this.lebar;
    }

    public double getKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}

public class Contoh4Encapsulation {
    public static void main(String[] args) {
        PersegiPanjang pPanjang = new PersegiPanjang();

        // Mencoba memberi nilai panjang negatif
        pPanjang.setPanjang(-5);
        // Memberikan nilai panjang dan lebar
        pPanjang.setPanjang(7.5);
        pPanjang.setLebar(5);

        System.out.println("Luas persegi panjang dengan panjang = " + pPanjang.getPanjang() + " dan lebar = " + pPanjang.getLebar() + " adalah : " + pPanjang.getLuas());
        System.out.println("Keliling persegi panjang dengan panjang = " + pPanjang.getPanjang() + " dan lebar = " + pPanjang.getLebar() + " adalah : " + pPanjang.getKeliling());
    }
}