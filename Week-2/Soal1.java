import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Banyak Test Case
        int T = input.nextInt();
        String[] numbers = new String[T];

        // Input ke array
        for (int i = 0; i < T; i++) {
            numbers[i] = input.next();
        }

        // Proses tiap elemen array
        for (int i = 0; i < T; i++) {
            String numberStr = numbers[i];  // Ambil value

            try {
                // Ubah jadi Long
                long n = Long.parseLong(numberStr);

                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                // Kalo tidak bisa di tampung di manapun
                System.out.println(numberStr + " can't be fitted anywhere.");
            }
        }

        input.close();
    }
}
