import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s[] = new String[3];
        int i[] = new int[3];

        for (int x = 0; x < s.length; x++) {
            s[x] = scanner.next();
            i[x] = scanner.nextInt();
        }

        System.out.println("==============================");
        for (int x = 0; x < s.length; x++) {
            System.out.println(String.format("%-15s", s[x]) + String.format("%03d", i[x]));
        }
        System.out.println("==============================");
    }
}
