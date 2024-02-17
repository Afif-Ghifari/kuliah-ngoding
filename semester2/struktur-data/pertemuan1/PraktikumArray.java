import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        String[] matkul = { "Pancasila", "KTI", "CTPS", "Matdas", "BIG", "Daspro", "Prak Daspro", "K3" },
                nilaiHuruf = new String[matkul.length];
        double[] nilai = new double[matkul.length],
                bobot = new double[nilai.length];
        int[] bobotSKS = { 2, 2, 2, 3, 2, 2, 3, 2 };

        double sigma = 0, IpSemester;
        int jmlSKS = 18;

        // Input nilai
        System.out.println("=========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=========================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan Nilai Angka Matkul " + matkul[i] + ": ");
            nilai[i] = sc.nextDouble();
        }

        // Proses
        for (int i = 0; i < nilaiHuruf.length; i++) {
            if (80 < nilai[i] && nilai[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4;
            } else if (73 < nilai[i]) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.5;
            } else if (65 < nilai[i]) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3;
            } else if (60 < nilai[i]) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.5;
            } else if (50 < nilai[i]) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2;
            } else if (39 < nilai[i]) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1;
            } else if (nilai[i] <= 39 && nilai[i] >= 0) {
                nilaiHuruf[i] = "E";
                bobot[i] = 0;
            } else {
                System.out.println("Kesalahan");
            }
        }

        for (int i = 0; i < bobot.length; i++) {
            sigma += bobot[i] * bobotSKS[i];
        }

        IpSemester = sigma / jmlSKS;

        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");

        System.out.printf("%-15s %-15s %-15s %-15s \n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i] != null) {
                System.out.printf("%-15s %-15.1f %-15s %-15.1f \n", matkul[i], nilai[i], nilaiHuruf[i], bobot[i]);
            }
        }
        System.out.println("=========================");
        System.out.print("IP: " + IpSemester);
    }
}
