import java.util.Scanner;

public class HargaBayar18 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Deklarasi variabel
    int harga, jumlah, jmlHalBuku;
    double dis, total, bayar, jmlDis;
    String merkBuku;

    // Input nilai variabel
    System.out.println("Masukkan merk buku");
    merkBuku = input.nextLine();
    System.out.println("Masukkan jumlah halaman buku yang dibeli");
    jmlHalBuku = input.nextInt();
    System.out.println("Masukkan harga buku yang dibeli");
    harga = input.nextInt();
    System.out.println("Masukkan jumlah buku yang dibeli");
    jumlah = input.nextInt();
    System.out.println("Masukkan diskon buku yang dibeli");
    dis = input.nextDouble();

    // Proses
    total = harga * jumlah;
    jmlDis = total * dis;
    bayar = total - jmlDis;

    // Output
    System.out.println("Merk buku yang dibeli \t\t\t= " + merkBuku);
    System.out.println("jumlah halaman buku yang dibeli \t= " + jmlHalBuku);
    System.out.println("Diskon yang anda dapatkan adalah \t= " + jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah \t= "+ bayar);
    }
}
