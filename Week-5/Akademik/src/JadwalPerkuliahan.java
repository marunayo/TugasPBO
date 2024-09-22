// Subclass JadwalPerkuliahan dari Akademik
public class JadwalPerkuliahan extends Akademik {
    private String hari;
    private String jam;
    private String ruang;
    private MataKuliah mataKuliah;
    private Dosen dosen;

    // Constructor untuk JadwalPerkuliahan
    public JadwalPerkuliahan(String hari, String jam, String ruang, MataKuliah mataKuliah, Dosen dosen) {
        this.hari = hari;
        this.jam = jam;
        this.ruang = ruang;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
    }

    // Getter untuk setiap atribut
    public String getHari() {
        return hari;
    }

    public String getJam() {
        return jam;
    }

    public String getRuang() {
        return ruang;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    @Override
    public void tampilkanInfo() {
        // Cetak baris data tanpa header
        System.out.printf("%-10s | %-15s | %-15s | %-25s | %-20s\n",
                hari, jam, ruang, mataKuliah.getNama(), dosen.getNama());
    }
}
