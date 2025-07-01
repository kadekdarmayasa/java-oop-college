
import id.ac.stikom.sion.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.login();

        id.ac.stikom.sion.Dosen dosenSion = new id.ac.stikom.sion.Dosen();
        dosenSion.login();

        id.ac.stikom.sdm.Dosen dosenSdm = new id.ac.stikom.sdm.Dosen();
        dosenSdm.login();
    }
}