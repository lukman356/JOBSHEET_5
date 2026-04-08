package JOBSHEET_5;

import java.util.Scanner;
import JOBSHEET_5.ClassDosen.Dosen;

public class DosenMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();

        Dosen[] dataDosen = new Dosen[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData dosen ke-" + (i + 1));

            System.out.print("Kode : ");
            String kode = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (true=L, false=P): ");
            boolean jk = sc.nextBoolean();

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();

            dataDosen[i] = new Dosen(kode, nama, jk, usia);
        }

        System.out.println("\nData Dosen:");
        for (int i = 0; i < n; i++) {
            dataDosen[i].tampil();
        }

        sc.close();
    }
}