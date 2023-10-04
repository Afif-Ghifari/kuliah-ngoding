import java.util.Scanner;

public class Pemilihan2Percobaan117 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner input17 = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan tahun: ");
        int tahun = input17.nextInt();

        // Pemilihan
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun " +tahun+ " adalah tahun kabisat");
            } 
        } else {
            System.out.println("Tahun " +tahun+ " Bukan Tahun kabisat");
        }
    }
}