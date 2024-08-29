import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A = input.nextLine();
        String B = input.nextLine();

        int length = A.length() + B.length();
        String newA = A.substring(0, 1).toUpperCase() + A.substring(1).toLowerCase();
        String newB = B.substring(0, 1).toUpperCase() + B.substring(1).toLowerCase();

        int result = A.compareTo(B);

        System.out.println(length);
        if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(newA + " " + newB);

    }
}
