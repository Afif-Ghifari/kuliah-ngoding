import java.util.Scanner;

public class Tugas1 {

    static void cariKodePlat(char[] arr, char[][] arr2 ,char kode){
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == kode) {
                index = i;
                break;
            }
        }

        System.out.println("Kota kode plat tersebut adalah: ");
        for (int i = 0; i < arr2.length; i++) {
            if (index == i) {
                for (int j = 0; j < arr2[i].length; j++) {
                    System.out.print(arr2[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        char[] kodePlat = {'A','B','D','E','F','G','H','L','N','T',};
        char[][] kota = {
            {'B','A','N','T','E','N',},
            {'J','A','K','A','R','T','A',},
            {'B','A','N','D','U','N','G',},
            {'C','I','R','E','B','O','N',},
            {'B','O','G','O','R',},
            {'P','E','K','A','L','O','N','G','A','N',},
            {'S','E','M','A','R','A','N','G',},
            {'S','U','R','A','B','A','Y','A',},
            {'M','A','L','A','N','G',},
            {'T','E','G','A','L',}
        };
        char cari;

        // Input
        System.out.print("Cari kode plat (Gunakan Huruf Kapital): ");
        cari = sc.next().charAt(0);
        System.out.println();
        cariKodePlat(kodePlat, kota, cari);
    }
}
