package latprak1;

import java.util.Scanner;

public class Limas {
    double sisiAlas, tinggi;

    double hitungVolume(double a, double t) {
        return a * a * t / 3;
    }

    double hitungLuasPermukaan(double a, double t) {
        return (a * a) + 4 * ((a * t) * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Limas[] limas = new Limas[3];

        for (int i = 0, j = 1; i < limas.length; i++, j++) {
            limas[i] = new Limas();
            System.out.print("Masukkan sisi alas Limas ke-" + j + ": ");
            limas[i].sisiAlas = sc.nextDouble();
            System.out.print("Masukkan tinggi Limas ke-" + j + ": ");
            limas[i].tinggi = sc.nextDouble();
        }

        for (int i = 0, j = 1; i < limas.length; i++, j++) {
            System.out.println("Limas ke-" + j);
            System.out.println("Volume: " + limas[i].hitungVolume(limas[i].sisiAlas, limas[i].tinggi));
            System.out.println("Luas Permukaan: " + limas[i].hitungLuasPermukaan(limas[i].sisiAlas, limas[i].tinggi) + "\n\n");
        }
    }
}