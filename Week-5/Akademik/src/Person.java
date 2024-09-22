public abstract class Person {
    private String nama;
    private String alamat;

    // Setter dan Getter untuk atribut
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    // Method abstract untuk menampilkan info
    public abstract void tampilkanInfo();
}