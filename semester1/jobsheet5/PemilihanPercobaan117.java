import java.util.Scanner;

public class PemilihanPercobaan117 {

    public static void main(String[] args) {
        
        // deklarasi dan input
        Scanner input18 = new Scanner(System.in);
        String hasil;

        // input nilai
        System.out.print("Masukkan angka : ");
        int angka = input18.nextInt();
         
        // proses
        hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        
        // output
        System.out.println("Ternary");
        System.out.println(angka+" adalah "+hasil);
    }
}

