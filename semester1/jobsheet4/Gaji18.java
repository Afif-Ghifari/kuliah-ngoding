import java.util.Scanner;

public class Gaji18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int jmlMasuk, jmlTdkMasuk, TotGaji, 
        gaji = 40000, potGaji = 25000;

        // Input nilai variabel
        System.out.println("Masukkan jumlah hari masuk kerja anda");
        jmlMasuk = input.nextInt();
        System.out.println("Masukkan jumlah hari tidak masuk kerja anda");
        jmlTdkMasuk = input.nextInt();

        // Proses
        TotGaji = (jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        // Output
        System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}
