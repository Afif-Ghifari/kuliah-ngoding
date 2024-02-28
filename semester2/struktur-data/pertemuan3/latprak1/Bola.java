package latprak1;

import java.util.Scanner;

public class Bola {
    double r;

    double hitungVolume(double r) {
        return (4 * Math.PI * r * r * r) / 3;
    }

    double hitungLuasPermukaan(double r) {
        return 4 * Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bola[] bola = new Bola[3];

        for (int i = 0, j = 1; i < bola.length; i++, j++) {
            bola[i] = new Bola();
            System.out.print("Masukkan jari-jari bola ke-" + j + ": ");
            bola[i].r = sc.nextDouble();
        }

        for (int i = 0, j = 1; i < bola.length; i++, j++) {
            System.out.println("Bola ke-" + j);
            System.out.println("Volume: " + bola[i].hitungVolume(bola[i].r));
            System.out.println("Luas Permukaan: " + bola[i].hitungLuasPermukaan(bola[i].r)+"\n\n");
        }
    }
}
