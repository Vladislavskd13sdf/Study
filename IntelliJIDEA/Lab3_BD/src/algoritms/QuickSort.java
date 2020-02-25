package algoritms;

public class QuickSort {
    public static int[] QuickSort(int[] ArrayNumbers)//быстрая сортировка
    {
        QuickSort sort = new QuickSort();
        int low = 0;
        int high = ArrayNumbers.length-1;
        int[] out_array;
        out_array = ArrayNumbers;
        sort.qucksort(out_array, low, high);

        return out_array;
    }

    private static void qucksort(int[] ArrayNumbers, int low, int high) {
        if (ArrayNumbers.length == 0 || low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        int oppora = ArrayNumbers[mid];
        int i = low, j = high;
        while (i <= j) {
            while (ArrayNumbers[i] < oppora) {
                i++;
            }
            while (ArrayNumbers[j] > oppora) {
                j--;
            }
            if (i <= j) {
                int temp = ArrayNumbers[i];
                ArrayNumbers[i] = ArrayNumbers[j];
                ArrayNumbers[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) {
            qucksort(ArrayNumbers, low, j);
        }
        if (high > i) {
            qucksort(ArrayNumbers, i, high);
        }
    }
}
