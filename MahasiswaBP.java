package JOBSHEET_5;

public class MahasiswaBP {
    Mahasiswa[] llisMhs = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < llisMhs.length) {
            llisMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : llisMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (llisMhs[j - 1].ipk < llisMhs[j].ipk) {
                    Mahasiswa tmp = llisMhs[j];
                    llisMhs[j] = llisMhs[j - 1];
                    llisMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) {
                if (llisMhs[j].ipk < llisMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa tmp = llisMhs[idxMin];
            llisMhs[idxMin] = llisMhs[i];
            llisMhs[i] = tmp;
        }
    }
    int sequentialSearch(double cari) {
        int posisi = -1;
        for (int i = 0; i < idx; i++) {
            if (llisMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data" + x + " tidak ditemukan");
        }
    }
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("nim\t : " + llisMhs[pos].nim);
            System.out.println("nama\t : " + llisMhs[pos].nama);
            System.out.println("kelas\t : " + llisMhs[pos].kelas);
            System.out.println("ipk\t : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (llisMhs[mid].ipk == cari) {
                return mid;
            }

            if (llisMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            }

            return findBinarySearch(cari, mid + 1, right);
        }
        return -1;
    }
}

