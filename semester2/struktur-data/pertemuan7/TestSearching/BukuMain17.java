import java.util.Scanner;

public class BukuMain17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku17 data = new PencarianBuku17();
        int jumBuku = 5;

        // Buku17 dataBk = new Buku17();
        // System.out.println("----------------------------------------");
        // System.out.println("Masukkan data buku secara urut dari kode buku terkecil");
        // for (int i = 0; i < jumBuku; i++) {
        // System.out.println("-------------------");
        // System.out.print("Kode buku \t: ");
        // int kodeBuku = s.nextInt();
        // System.out.print("Judul buku \t: ");
        // String judulBuku = s1.nextLine();
        // System.out.print("Tahun terbit \t: ");
        // int tahunTerbit = s.nextInt();
        // System.out.print("Pengarang \t: ");
        // String pengarang = s1.nextLine();
        // System.out.print("Stock \t\t: ");
        // int stock = s.nextInt();

        // Buku17 m = new Buku17(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        // data.tambah(m);
        // }

        Buku17 m4 = new Buku17(20214, "Web programming", 2022, "Pustaka Adi", 2);
        data.tambah(m4);
        Buku17 m2 = new Buku17(20211, "Big data", 2020, "Susilo", 3);
        data.tambah(m2);
        Buku17 m5 = new Buku17(20215, "Etika mahasiswa", 2023, "Darmawan Adi", 2);
        data.tambah(m5);
        Buku17 m3 = new Buku17(20212, "Desain UI", 2021, "Supriadi", 3);
        data.tambah(m3);
        Buku17 m1 = new Buku17(20210, "Algoritma", 2019, "Wahyuni", 5);
        data.tambah(m1);

        data.bubbleSort();
        System.out.println("---------------------------------------");
        System.out.println("Data keseluruhan buku: ");
        data.tampil();
        System.out.println("_______________________________________");
        System.out.println("_______________________________________");
        System.out.println("Pencarian data: ");
        System.out.print("Masukkan kode buku yang dicari: ");
        String cari = s.nextLine();

        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqJudul(cari);
        data.TampilPosisi(cari, posisi);

        System.out.println("Menggunakan binary search");
        posisi = data.FindBinaryJudul(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
