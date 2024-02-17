import java.util.Scanner;

public class Tugas2 {
    static double operasi(double s, double v, double t) {
        double hasil = 0;

        if (v == 0) {
            hasil = s / t;
        } else if (s == 0) {
            hasil = v * t;
        } else if (t == 0) {
            hasil = s / v;
        }
        return hasil;
    }

    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        byte pilih;
        double v, s, t;

        // Pilih proses
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.print("Pilih rumus: ");
        pilih = sc.nextByte();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan jarak (km): ");
                s = sc.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                t = sc.nextDouble();
                v = 0;
                v = operasi(s, v, t);
                System.out.println("Kecepatannya adalah (km/jam): " + v);

                break;
            case 2:
                System.out.print("Masukkan kecepatan (km/jam): ");
                v = sc.nextDouble();
                System.out.print("Masukkan waktu (jam): ");
                t = sc.nextDouble();
                s = 0;
                s = operasi(s, v, t);
                System.out.println("Jaraknya adalah (km): " + s);

                break;
            case 3:
                System.out.print("Masukkan jarak (km): ");
                s = sc.nextDouble();
                System.out.print("Masukkan kecepatan (km/jam): ");
                v = sc.nextDouble();
                t = 0;
                t = operasi(s, v, t);
                System.out.println("Waktunya adalah (jam): " + t);

                break;

            default:
                break;
        }
    }
}
