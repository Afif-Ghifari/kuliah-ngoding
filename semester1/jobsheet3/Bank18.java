import java.util.Scanner;

public class Bank18 {
    public static void main(String[] args) {
        // deklarasi variabel
        Scanner input = new Scanner(System.in);
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;
        
        //input 
        System.out.println("Masukkan jumlah tabungan awal");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = input.nextInt();

        // proses
        bunga = lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir = bunga+jml_tabungan_awal;

        // output
        System.out.println("Jumlah tabungan akhir anda adalah = "+jml_tabungan_akhir);
    }
}
