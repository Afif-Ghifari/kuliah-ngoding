import java.util.Scanner;

public class MahasiswaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = new Mahasiswa[3];

        for (int i = 0, j = 1; i < mhs.length; i++, j++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + j);
            mhs[i] = new Mahasiswa();
            System.out.print("Masukkan nama: ");
            sc.nextLine();
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan nim: ");
            mhs[i].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            mhs[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            mhs[i].IPK = sc.nextDouble();
        }

        double rataRata = 0, 
               ipkTertinggi = 0;
        int dataMhsTertinggi = 0;

        for (int i = 0; i < mhs.length; i++) {
            rataRata += mhs[i].IPK;
        }
        rataRata /= mhs.length;

        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].IPK > ipkTertinggi) {
                ipkTertinggi = mhs[i].IPK;
                dataMhsTertinggi = i;
            }
        }

        for (int i = 0, j = 1; i < mhs.length; i++, j++) {
            System.out.println("\nData mahasiswa ke-" + j);
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("Nim: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenisKelamin);
            System.out.println("IPK: " + mhs[i].IPK);
        }
        
        System.out.println();
        System.out.println("Rata-rata IPK: " + rataRata);
        System.out.println("Data mahasiswa dengan IPK tertinggi: " + ipkTertinggi);
        System.out.println("Data mahasiswa:");
        System.out.println("Nama: " + mhs[dataMhsTertinggi].nama);
        System.out.println("NIM: " + mhs[dataMhsTertinggi].nim);
        System.out.println("Jenis kelamin: " + mhs[dataMhsTertinggi].jenisKelamin);
        System.out.println("IPK: " + mhs[dataMhsTertinggi].IPK);
    }
}
