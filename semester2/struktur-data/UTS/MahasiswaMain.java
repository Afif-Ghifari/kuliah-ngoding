import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        MahasiswaListing data = new MahasiswaListing();

        Mahasiswa mhs1 = new Mahasiswa("MUHAMMAD AFIF AL GHIFARI",
                new int[] { 31, 42, 10, 1, 25, 8, 39, 24, 0, 34, 42, 42, 36, 14, 11, 44, 27 });

        data.tambah(mhs1);
        System.out.println("Sebelum diurutkan: ");
        data.tampilAll();

        System.out.println("\n\n");
        data.SelectionSortData(mhs1.data);

        System.out.println("Setelah diurutkan: ");
        data.tampilAll();

        System.out.println("\n\n");
        System.out.print("Masukkan data yang ingin dicari: ");
        int cari = sc.nextInt();

        System.out.print("Pilih nomor mahasiswa: ");
        int cariMhs = sc2.nextInt()-1;

        int hasil = data.binarySearchData(cariMhs, cari, 0, mhs1.data.length - 1);
        
        data.tampilSearch(hasil, cariMhs);
    }
}
