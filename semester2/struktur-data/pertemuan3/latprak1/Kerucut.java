package latprak1;

import java.util.Scanner;

public class Kerucut {
    
    double r, sisiMiring, tinggi;

    double hitungVolume(double jr, double sm, double t) {
        return (Math.PI * jr * jr) * t / 3;
    }

    double hitungLuasPermukaan(double jr, double sm, double t) {
        return Math.PI * jr * (sm + jr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Kerucut[] kerucut = new Kerucut[3];

        for (int i = 0, j = 1; i < kerucut.length; i++, j++) {
            kerucut[i] = new Kerucut();
            System.out.print("Masukkan jari-jari Kerucut ke-" + j + ": ");
            kerucut[i].r = sc.nextDouble();
            System.out.print("Masukkan sisi miring Kerucut ke-" + j + ": ");
            kerucut[i].sisiMiring = sc.nextDouble();
            System.out.print("Masukkan tinggi Kerucut ke-" + j + ": ");
            kerucut[i].tinggi = sc.nextDouble();
        }

        for (int i = 0, j = 1; i < kerucut.length; i++, j++) {
            System.out.println("Kerucut ke-" + j);
            System.out.println("Volume: " + kerucut[i].hitungVolume(kerucut[i].r, kerucut[i].sisiMiring, kerucut[i].tinggi));
            System.out.println("Luas Permukaan: "+ kerucut[i].hitungLuasPermukaan(kerucut[i].r, kerucut[i].sisiMiring, kerucut[i].tinggi) + "\n\n");
        }
    }
}
