public class Soal2 {
    public static void main(String[] args) {
        int i = 42;
        String s = (i<40)?"Life":(i>50)?"universe":"everything";
        // Teknik ini adalah Ternary Operator
        // Yaitu sebuah cara singkat dalam if-else
        // Ternary operator terdiri dari 3 hal : kondisi, nilai jika true, dan nilai jika false
        // (condition) ? statement true : statement false
        // dalam kasus ini, statement false dari condition ke-1 di isi dengan condition ke-2

        System.out.println(s);
    }
}
