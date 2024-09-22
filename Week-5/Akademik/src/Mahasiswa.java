// Subclass Mahasiswa dari Person
public class Mahasiswa extends Person {
    private String nim;
    private String prodi;

    // Constructor khusus untuk Mahasiswa
    public Mahasiswa(String nama, String alamat, String nim, String prodi) {
        setNama(nama);
        setAlamat(alamat);
        this.nim = nim;
        this.prodi = prodi;
    }

    // Getter untuk NIM dan Prodi
    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
    }
}