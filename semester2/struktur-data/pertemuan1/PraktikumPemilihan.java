import java.util.Scanner;

class PraktikumPemilihan {
    public static void main(String[] args) {

        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int inputNilaiTugas, inputNilaiKuis, inputNilaiUTS, inputNilaiUAS;
        float nilaiAkhir;
        String nilaiHuruf = null;

        // Input nilai
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas: ");
        inputNilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        inputNilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        inputNilaiUTS = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        inputNilaiUAS = sc.nextInt();
        System.out.println("=======================");

        // Proses
        if ((inputNilaiTugas > 100 || inputNilaiTugas > 100 || inputNilaiUAS > 100 || inputNilaiUTS > 100) || (inputNilaiTugas < 0 || inputNilaiTugas < 0 || inputNilaiUAS < 0 || inputNilaiUTS < 0)) {
            System.out.println("=======================");
            System.out.println("Nilai Tidak Valid");
            System.out.println("=======================");
        } else {
            nilaiAkhir = (float) ((inputNilaiTugas * 0.2) + (inputNilaiKuis * 0.2) + (inputNilaiUTS * 0.3) + (inputNilaiUAS * 0.4));
            if (80 < nilaiAkhir && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (73 < nilaiAkhir) {
                nilaiHuruf = "B+";
            } else if (65 < nilaiAkhir) {
                nilaiHuruf = "B";
            } else if (60 < nilaiAkhir) {
                nilaiHuruf = "C+";
            } else if (50 < nilaiAkhir) {
                nilaiHuruf = "C";
            } else if (39 < nilaiAkhir) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir <= 39 && nilaiAkhir >= 0) {
                nilaiHuruf = "E";
            } else {
                System.out.println("Kesalahan");
            }
            System.out.println("=======================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=======================");

            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("Anda Tidak Lulus");
            } else {
                System.out.println("Selamat Anda Lulus!");
            }
        }
    }
}