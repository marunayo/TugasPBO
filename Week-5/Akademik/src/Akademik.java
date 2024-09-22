// Superclass Akademik
public abstract class Akademik {
    private String id;
    private String nama;

    // Setter dan Getter untuk atribut
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Method abstract untuk menampilkan info
    public abstract void tampilkanInfo();
}