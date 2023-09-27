import java.util.Scanner;

public class PemilihanPercobaan217 {
    public static void main(String[] args) {
        
        Scanner input17 = new Scanner(System.in);
        
        // deklarasi variabel dan input nilai
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

        // output
        System.out.println("Nilai akhir = "+total+" sehingga "+message);
    }
}
