package id.kumara.sedana;

public class Setoran {
    protected String idSetoran;
    protected String tanggalSetoran;
    private double jumlahSetoran;
    private Nasabah nasabah;

    public Setoran(String idSetoran, String tanggalSetoran, double jumlahSetoran, Nasabah nasabah) {
        this.idSetoran = idSetoran;
        this.tanggalSetoran = tanggalSetoran;
        this.jumlahSetoran = jumlahSetoran;
        this.nasabah = nasabah;
    }
    
    public double getJumlah() {
        return jumlahSetoran;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }
}
