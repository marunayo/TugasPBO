// Subclass MataKuliah dari Akademik
public class MataKuliah extends Akademik {
    private String kodeMK;

    // Constructor untuk MataKuliah
    public MataKuliah(String kodeMK, String namaMK) {
        setId(kodeMK);
        setNama(namaMK);
        this.kodeMK = kodeMK;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + getNama());
    }
}