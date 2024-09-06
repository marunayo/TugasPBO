import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] newStr = s.split(" ");

        switch (newStr[1]) {
            case "+":
                System.out.println(Integer.parseInt(newStr[0]) + Integer.parseInt(newStr[2]));
                break;
            case "-":
                System.out.println(Integer.parseInt(newStr[0]) - Integer.parseInt(newStr[2]));
                break;
            case "*":
                System.out.println(Integer.parseInt(newStr[0]) * Integer.parseInt(newStr[2]));
                break;
            case "/":
                System.out.println(Integer.parseInt(newStr[0]) / Integer.parseInt(newStr[2]));
                break;
            case "%":
                System.out.println(Integer.parseInt(newStr[0]) % Integer.parseInt(newStr[2]));
                break;
        }
    }
}
