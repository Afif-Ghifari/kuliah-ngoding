    import java.util.Scanner;

    public class PemilihanPercobaan217 {
        public static void main(String[] args) {
            
            Scanner input17 = new Scanner(System.in);
            
            // deklarasi variabel dan input nilai
            String nilaiHuruf;
            
            System.out.print("Nilai uas\t:");
            float uas = input17.nextFloat();
            System.out.print("Nilai uts\t:");
            float uts = input17.nextFloat();
            System.out.print("Nilai kuis\t:");
            float kuis = input17.nextFloat();
            System.out.print("Nilai tugas\t:");
            float tugas = input17.nextFloat();

            // proses
            float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.2F) + (tugas * 0.1F);
            
            // pemilihan
            String message = total < 65 ? "Remidi" : "Tidak remidi";

            if (total <= 39) {
                nilaiHuruf = "E";
            } else if (39 < total && total <= 50) {
                nilaiHuruf = "D";
            } else if (50 < total && total <= 60) {
                nilaiHuruf = "C";
            } else if (60 < total && total <= 65) {
                nilaiHuruf = "C+";
            } else if (65 < total && total <= 73) {
                nilaiHuruf = "B";
            } else if (73 < total && total <= 80) {
                nilaiHuruf = "B+";
            } else if (80 < total && total <= 100) {
                nilaiHuruf = "A";
            } else {
                nilaiHuruf = "tidak valid";
            }

            // output
            System.out.println("Nilai akhir = "+total+" sehingga "+message);
            System.out.println("Konversi ke nilai huruf = " + nilaiHuruf);
        }
    }
