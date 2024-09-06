import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // gaji = 500.000 per bulan
        int gajiPokok = 500000;
        int gajiAkhir;

        // Berapa barang yang dijual?
        int barangTerjual = scanner.nextInt();

        if (barangTerjual > 80) {
            gajiAkhir = gajiPokok + (((barangTerjual * 50000) * 35) / 100) + ((barangTerjual * 50000) / 10);
        } else if (barangTerjual >= 40) {
            gajiAkhir = gajiPokok + (((barangTerjual * 50000) * 25) / 100) + ((barangTerjual * 50000) / 10);
        } else if (barangTerjual > 15 && barangTerjual < 40) {
            gajiAkhir = gajiPokok + ((barangTerjual * 50000) / 10);
        } else {
            int kekurangan = 15 - barangTerjual;
            gajiAkhir = gajiPokok - (((50000 * 15) * kekurangan) / 100);
        }

        System.out.println(gajiAkhir);
    }
}
