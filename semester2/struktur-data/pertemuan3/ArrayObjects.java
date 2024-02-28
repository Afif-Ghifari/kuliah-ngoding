import java.util.Scanner;

public class ArrayObjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pjgArr;

        System.out.print("Masukkan panjang array: ");
        pjgArr = sc.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[pjgArr];

        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}