import java.util.Scanner;

public class NestedLoop_2341720168 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        double total = 0, rata = 0;

        // perulangan
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = scanner.nextDouble();
                total += temps[i][j]; 
            } 

            // proses hitung rata-rata
            rata = total / temps[i].length; 
            System.out.println("Rata-rata: " + rata); 
            System.out.println(); 
        }
        
        // Output
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
            }
            System.out.println();
        }
    }

}
