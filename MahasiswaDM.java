package JOBSHEET_5;

import java.util.Scanner;

public class MahasiswaDM {
    public static void main(String[] args) {
        MahasiswaBP list = new MahasiswaBP();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));

            System.out.print("NIM : ");
            String nim = sc.nextLine();

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.print("--------------------------------------");
            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
            
        }

        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari:");
        System.out.println("IPK:");
        double cari = sc.nextDouble();
        System.out.println("------------------");
        System.out.println("menggunakan binary search");
        System.out.println("-------------------------------");
        int posisi2 = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);

        System.out.println("menggunakan sequential searcing");
        int posisi = list.sequentialSearch(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);

        Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        Mahasiswa m2 = new Mahasiswa("124", "Ayu", "2A", 3.5);
        Mahasiswa m3 = new Mahasiswa("125", "Sofi", "2A", 3.1);
        Mahasiswa m4 = new Mahasiswa("126", "Sita", "2A", 3.9);
        Mahasiswa m5 = new Mahasiswa("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting :");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting menggunakan SELECTION SORT (ASC) :");
        list.selectionSort();
        list.tampil();

        // melakukan pencarian data dengan binary
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data Binary");
        System.out.println("---------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari:");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------");
        int posisi22 = list.findBinarySearch(cari2, 0, list.idx - 1);
        list.tampilPosisi(cari2, posisi22);
        list.tampilDataSearch(cari2, posisi22);
    }
}
