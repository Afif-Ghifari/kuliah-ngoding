import java.util.Scanner;

public class LinearSearch17 {
    public static void main(String[] args) {
        
        // deklarasi
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa : ");
        int panjangArray = sc.nextInt();
        int[] arrayInt = new int[panjangArray];
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        System.out.println("Key ada di dalam array pada posisi indeks ke-"+hasil);
    }
}
