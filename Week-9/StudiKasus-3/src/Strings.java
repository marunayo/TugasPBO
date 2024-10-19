import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of strings to sort: ");
        int size = scan.nextInt();
        scan.nextLine();

        String[] strings = new String[size];

        System.out.println("Enter the strings: ");
        for (int i = 0; i < size; i++) {
            strings[i] = scan.nextLine();
        }

        Sorting.insertionSort(strings);

        System.out.println("Sorted strings: ");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
