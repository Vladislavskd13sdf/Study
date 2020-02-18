package sort;

public class Sorting {


    public int[] BobbleSort(int[] ArrayNumbers)//сортировка пузырьком
    {
        //учебая сортировка, лежит в основе некотырых других алгоритмов сортировки Сложность:О(n^2)
        int[] out_array;
        out_array = ArrayNumbers;
        for (int out = ArrayNumbers.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (ArrayNumbers[in] > ArrayNumbers[in + 1]) {
                    int swop = out_array[in];
                    out_array[in] = out_array[in + 1];
                    out_array[in + 1] = swop;
                }
            }
        }

        return out_array;
    }

    public int[] SelectionSort(int[] ArrayNumbers)//сортировка выбором
    {
        //без выделения доп. памяти, Сложность:О(n^2)
        int[] out_array;
        out_array = ArrayNumbers;
        for (int min = 0; min < out_array.length - 1; min++) {
            int buff = min;
            for (int item = min + 1; item < out_array.length; item++) {
                if (out_array[item] < out_array[buff]) {
                    buff = item;
                }
            }
            int tmp = out_array[min];
            out_array[min] = out_array[buff];
            out_array[buff] = tmp;
        }

        return out_array;
    }

    public int[] InsertionSort(int[] ArrayNumbers) {//сортировка вставками
        //сложность:О(n^2)
        int[] out_array;
        out_array = ArrayNumbers;
        for (int i = 1; i < out_array.length; i++) {
            int newElement = out_array[i];
            int location = i - 1;
            while (location >= 0 && out_array[location] > newElement) {
                out_array[location + 1] = out_array[location];
                location--;
            }
            out_array[location + 1] = newElement;
        }


        return out_array;
    }

    public int[] QuickSort(int[] ArrayNumbers)//быстрая сортировка
    {
        Sorting sort = new Sorting();
        int low = 0;
        int high = ArrayNumbers.length-1;
        int[] out_array;
        out_array = ArrayNumbers;
        sort.qucksort(out_array, low, high);

        return out_array;
    }

    private void qucksort(int[] ArrayNumbers, int low, int high) {
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
