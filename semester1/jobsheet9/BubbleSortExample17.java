import java.util.Scanner;

public class BubbleSortExample17 {
    public static void main(String[] args) {

        // deklarasi variabel
        int[] intData = {34, 18, 87, 72, 32, 54, 43};
        int temp = 0;

        // proses
        for (int i = 0; i < intData.length; i++) {
            for (int j = 1; j < intData.length-i; j++) {
                if (intData[j-1] > intData[j]) {
                    // swap elemen
                    temp = intData[j];
                    intData[j] = intData[j-1];
                    intData[j-1] = temp;
                }
            }
        }

        // output
        System.out.println("Hasil pengurutan: ");
        for (int i = intData.length-1; i >= 0; i--) {
            System.out.println(intData[i]);
        }
    }
}