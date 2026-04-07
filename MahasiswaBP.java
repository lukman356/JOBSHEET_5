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
}
