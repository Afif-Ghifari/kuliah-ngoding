import java.util.Scanner;

public class tugas1 {

    // Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi: ");
        int s = sc.nextInt();

        Kubus17(s);
    }

    // Fungsi
    public static void Kubus17(int sisi) {
        int vol = sisi * sisi * sisi;
        int LP = 6 * (sisi * sisi);

        System.out.println("Volume kubus: "+vol);
        System.out.println("Luas permukaan: "+LP);
    }
}
