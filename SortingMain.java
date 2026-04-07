package JOBSHEET_5;

public class SortingMain {
    public static void main(String[] args) {
        int[] a = {30, 20, 2, 8, 14};
        Sorting1 dataurut1 = new Sorting1(a, a.length);
        System.out.println("Data awal:");
        dataurut1.tampilData();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC):");
        dataurut1.tampilData();
    }
}