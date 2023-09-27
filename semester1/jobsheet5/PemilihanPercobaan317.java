import java.util.Scanner;

public class PemilihanPercobaan317 {
    public static void main(String[] args) {
        
        // deklarasi variabel dan input nilai
        Scanner input17 = new Scanner(System.in);

        double angka1, angka2, hasil;
        char operator;

        System.out.println("Modifikasi");
        System.out.print("Masukkan angka pertama\t\t= ");
        angka1 = input17.nextDouble();
        System.out.print("Masukkan angka kedua\t\t= ");
        angka2 = input17.nextDouble();
        System.out.print("Masukkan operator (+ - * /)\t= ");
        operator = input17.next().charAt(0);

        // proses dan output
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
                break;
        }
    }
}
