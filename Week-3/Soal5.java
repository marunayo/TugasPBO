import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 4 mobil lewat
        String platMobil = scanner.nextLine();
        String platGabung = platMobil.replace(" ", "");
        long plats = Long.parseLong(platGabung) - 999999;

        if (plats % 5 != 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}