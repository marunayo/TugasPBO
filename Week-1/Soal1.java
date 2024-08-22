public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);

        System.out.println("Hasil 1 " + hasil);
        // alasan 1:
        // tipe data byte mempunyai range -128 to 127
        // tipe data primitif seperti byte, mempunyai sifat kalkulasi circular
        // artinya ketika, hasil kalkulasi melebihi range dia akan mengulang
        // reference: https://medium.com/@malindurnawarathne/what-happen-if-you-exceed-the-byte-range-in-java-128-to-127-561c5838356b

        // alasan 2:
        // angka1 yang bernilai 125 dan 6 ketika di convert ke bentuk binary menjadi
        // 1111101 + 0000110 = 10000011 (131)
        // kemudian dilakukan operasi komplemen 2
    }
}
