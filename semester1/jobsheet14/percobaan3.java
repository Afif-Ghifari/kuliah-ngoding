import java.util.Scanner;

public class percobaan3 {
    // fungsi
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (1);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }

    // fungsi main
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int tahun;

        // input nilai
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = sc.nextInt();

        // output
        System.out.print("Jumlah saldo setelah " + tahun + " tahun: ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
