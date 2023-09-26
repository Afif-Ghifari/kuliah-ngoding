import java.util.Scanner;
public class Lingkaran18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            // Deklarasi variabel
            int r;
            double keliling, luas, phi = 3.14;

            // Input nilai
            System.out.println("Masukkan jari-jari lingkaran: ");
            r = input.nextInt();

            // Proses
            keliling = 2*phi*r;
            luas = phi*r*r;

            // Output keliling, luas
            System.out.println("Keliling = "+keliling);
            System.out.println("Luas     = "+luas);
    }
}