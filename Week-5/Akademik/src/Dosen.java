// Subclass Dosen dari Person
public class Dosen extends Person {
    private String kodeDosen;
    private String mataKuliah;

    // Constructor khusus untuk Dosen
    public Dosen(String nama, String alamat, String kodeDosen, String mataKuliah) {
        setNama(nama);
        setAlamat(alamat);
        this.kodeDosen = kodeDosen;
        this.mataKuliah = mataKuliah;
    }

    // Getter untuk NIP dan Mata Kuliah
    public String getKodeDosen() {
        return kodeDosen;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Kode Dosen: " + kodeDosen);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}