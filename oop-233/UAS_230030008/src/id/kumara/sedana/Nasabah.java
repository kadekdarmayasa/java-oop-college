package id.kumara.sedana;

public class Nasabah {
    private String idNasabah;
    private String namaNasabah;

    public Nasabah(String idNasabah, String namaNasabah) {
        this.idNasabah = idNasabah;
        this.namaNasabah = namaNasabah;
    }

    public String getIdNasabah() {
        return this.idNasabah;
    }

    public String getNamaNasabah() {
        return this.namaNasabah;
    }
}
