package JOBSHEET_5;

public class Sorting1 {

    int[] data;
    int jumData;

    public Sorting1(int Data[], int jumData) {
        this.jumData = jumData;
        data = new int[jumData];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    void bubbleSort() {
        for (int i = 0; i < jumData - 1; i++) {
            for (int j = 0; j < jumData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}


    

