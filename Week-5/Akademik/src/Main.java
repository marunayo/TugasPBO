import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<JadwalPerkuliahan> jadwalList = new ArrayList<>();
        ArrayList<Dosen> dosenList = new ArrayList<>();
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad Raihan Pratama", "Bandung", "231511055", "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Tresnardi", "Bandung", "231511062", "Teknik Informatika");
        Mahasiswa mahasiswa3 = new Mahasiswa("Daffa Al Gifari", "Bandung", "231511038", "Teknik Informatika");
        Mahasiswa mahasiswa4 = new Mahasiswa("Daiva", "Bandung", "231511039", "Teknik Informatika");

        // Menambahkan mahasiswa ke daftar
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(mahasiswa3);
        mahasiswaList.add(mahasiswa4);

        // Membuat objek Dosen
        Dosen yudi = new Dosen("Yudi Widhiyasana", "Bandung", "KO013N", "[TE] Komputer Grafik");
        Dosen santi = new Dosen("Santi Sundari", "Bandung", "KO009N", "[TE] PRPL");
        Dosen trisna = new Dosen("Trisna Gelar A", "Bandung", "KO078N", "[PR] Komputer Grafik");
        Dosen adeH = new Dosen("Ade Hodijah", "Bandung", "KO060N", "[PR] Basis Data");
        Dosen rizqi = new Dosen("Muhammad Rizqi S", "Bandung", "KO074N", "Aljabar Linier");
        Dosen bambang = new Dosen("Bambang Wisnuadhi", "Bandung", "KO003N", "Proyek 3");
        Dosen wendi = new Dosen("Wendi Wirasta", "Bandung", "KO079N", "Proyek 3");
        Dosen didik = new Dosen("Didik Suwito Pribadi", "Bandung", "KO005N", "Proyek 3");
        Dosen adeC = new Dosen("Ade Chandra Nugraha", "Bandung", "KO001N", "[TE] Basis Data");
        Dosen zulkifli = new Dosen("Zulkifli Arsyad", "Bandung", "KO061N", "Pemograman Berbasis Objek");
        Dosen siti = new Dosen("Siti Dwi Setiarini", "Bandung", "KO075N", "Matematika Diskrit II");
        Dosen yadhi = new Dosen("Yadhi Aditya P", "Bandung", "KO052N", "[PR] PRPL");

        // Menambahkan dosen ke dalam list
        dosenList.add(yudi);
        dosenList.add(santi);
        dosenList.add(trisna);
        dosenList.add(adeH);
        dosenList.add(rizqi);
        dosenList.add(bambang);
        dosenList.add(wendi);
        dosenList.add(didik);
        dosenList.add(adeC);
        dosenList.add(zulkifli);
        dosenList.add(siti);
        dosenList.add(yadhi);

        // Membuat objek MataKuliah
        MataKuliah kgTE = new MataKuliah("21IF2015", "[TE] Komputer Grafik");
        MataKuliah prplTE = new MataKuliah("21IF2013", "[TE] PRPL");
        MataKuliah kgPR = new MataKuliah("21IF2015", "[PR] Komputer Grafik");
        MataKuliah basisDataPR = new MataKuliah("21IF2012", "[PR] Basis Data");
        MataKuliah aljabarLinier = new MataKuliah("21IF2014", "Aljabar Linier");
        MataKuliah proyek3 = new MataKuliah("21IF2016", "Proyek 3");
        MataKuliah basisDataTE = new MataKuliah("21IF2012", "[TE] Basis Data");
        MataKuliah pbo = new MataKuliah("21IF2011", "Pemograman Berbasis Objek");
        MataKuliah md2 = new MataKuliah("21IF2010", "Matematika Diskrit II");

        // Menambahkan jadwal perkuliahan
        jadwalList.add(new JadwalPerkuliahan("Senin", "08:40 - 10:40", "D105", kgTE, yudi));
        jadwalList.add(new JadwalPerkuliahan("Senin", "10:40 - 12:20", "D105", prplTE, santi));
        jadwalList.add(new JadwalPerkuliahan("Senin", "13:00 - 15:30", "D102", kgPR, trisna));
        jadwalList.add(new JadwalPerkuliahan("Selasa", "07:00 - 12:20", "D106", basisDataPR, adeH));
        jadwalList.add(new JadwalPerkuliahan("Selasa", "13:00 - 14:40", "D101", aljabarLinier, rizqi));
        jadwalList.add(new JadwalPerkuliahan("Rabu", "07:00 - 16:40", "D116", proyek3, bambang));
        jadwalList.add(new JadwalPerkuliahan("Rabu", "07:00 - 16:40", "D116", proyek3, wendi));
        jadwalList.add(new JadwalPerkuliahan("Rabu", "07:00 - 16:40", "D116", proyek3, didik));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "07:00 - 08:40", "D105", basisDataTE, adeC));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "08:40 - 12:20", "D105 & D116", pbo, zulkifli));
        jadwalList.add(new JadwalPerkuliahan("Kamis", "13:50 - 16:40", "D108", md2, siti));
        jadwalList.add(new JadwalPerkuliahan("Jumat", "07:50 - 14:40", "D116", prplTE, yadhi));

        // Menu
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan data mahasiswa");
            System.out.println("2. Tampilkan data dosen");
            System.out.println("3. Tampilkan jadwal perkuliahan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    System.out.printf("%-25s | %-15s | %-15s | %-25s\n", "Nama", "Alamat", "NIM", "Prodi");
                    System.out.println("------------------------------------------------------------------------");
                    for (Mahasiswa mhs : mahasiswaList) {
                        System.out.printf("%-25s | %-15s | %-15s | %-25s\n",
                                mhs.getNama(), mhs.getAlamat(), mhs.getNim(), mhs.getProdi());
                    }
                    break;
                case 2:
                    System.out.println("\nData Dosen:");
                    System.out.printf("%-20s | %-15s | %-10s | %-25s\n", "Nama", "Alamat", "Kode Dosen", "Mata Kuliah");
                    System.out.println("--------------------------------------------------------------");
                    for (Dosen dosen : dosenList) {
                        System.out.printf("%-20s | %-15s | %-10s | %-25s\n",
                                dosen.getNama(), dosen.getAlamat(), dosen.getKodeDosen(), dosen.getMataKuliah());
                    }
                    break;
                case 3:
                    System.out.println("\nJadwal Perkuliahan:");
                    System.out.printf("%-10s | %-15s | %-15s | %-25s | %-20s\n", "Hari", "Jam", "Ruang", "Mata Kuliah", "Dosen");
                    System.out.println("--------------------------------------------------------------------------------------");

                    for (JadwalPerkuliahan jadwal : jadwalList) {
                        jadwal.tampilkanInfo();
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    scanner.close(); // Tutup scanner
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
