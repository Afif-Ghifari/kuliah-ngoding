import java.util.Scanner;

public class PraktikumPerulangan {
    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        long nim = 0;
        int digit;

        // Input nilai
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLong();
        System.out.println("=================");
        System.out.println();

        // Proses
        digit = (int) (nim % 100);

        if (digit < 10) {
            digit += 10;
        }
        System.out.println("n = " + digit);

        for (int i = 1; i <= digit; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" * ");
                }
            }
        }
        sc.close();
    }
}
