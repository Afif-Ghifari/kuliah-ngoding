import java.util.Scanner;

public class WhileKelipatan17 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner scan = new Scanner(System.in);
        int kelipatan,
                total = 0,
                jumlah = 0,
                counter = 0,
                i=1;
        double rataRata = 0;

        // Input nilai
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        // Proses dan perulangan
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }
        rataRata = (double) total / counter;

        // Output
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata-rata bilangan adalah %.2f\n", rataRata);
    }
}
