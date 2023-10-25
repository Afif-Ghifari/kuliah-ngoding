import java.util.Scanner;

public class LinearSearch17 {
    public static void main(String[] args) {
        
        // deklarasi variabel
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah array : ");
        int panjangArray = sc.nextInt();
        int[] arrayInt = new int[panjangArray];
        int key = 0;
        int hasil = 0;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-"+i+" : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada di dalam array pada posisi indeks ke-"+hasil);
    }
}
