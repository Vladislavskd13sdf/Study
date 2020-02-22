//Структуры и организация данных
//Koshulko Vladislav

import java.util.Random;
import java.util.Scanner;

import sort.Sorting;


public class Main {

    private int ArrayIndex(int ResultInput, int[] RandomArray) {//находим индекс элемента, число которого равно 1000+N
        for (int i = 0; i < RandomArray.length; i++) {
            if (RandomArray[i] == ResultInput) {
                return i;
            }
        }
        return -1;
    }

    /*
    private int CountNumbers2(int ResultInput, int[] RandomArray) {//находим каличестко чисел от числа N до 2N
        int ValueIndex = 0;
        int Count = 0;
        int StopIndex = 0;
        for (; ValueIndex < RandomArray.length; ValueIndex++) {

            if (RandomArray[StopIndex] == ResultInput) {
                Count++;
                if (RandomArray[ValueIndex] == ResultInput * 2) {
                    return Count;
                }
            } else {
                StopIndex = ValueIndex;
            }
        }
        return -1;
    }
    */

    private int CountNumbers(int ResultInput, int[] RandomArray) {//находим каличестко чисел от числа N до 2N
        //преемущество двухциклического метода над методом с двумя ветвлениями он работает быстрее за счет меньшего каличества операций
        int ValueIndex = 0;
        int Count = 0;
        for (; ValueIndex < RandomArray.length; ValueIndex++) {
            if (RandomArray[ValueIndex] == ResultInput) {
                break;
            }
        }
        for (int i = ValueIndex; i < RandomArray.length; i++) {
            Count++;
            if (RandomArray[i] == ResultInput * 2) {
                return Count;
            }
        }
        return 0;
	    /*int count=0;
	    int[] new_array_list=new int[ResultInput];
	    try
        {
            for(count=ResultInput;count<ResultInput*2;count++)
            {
                new_array_list[count]=RandomArray[count];
            }
        }
	    catch (Exception ex)
        {
            return count;
        }
        return count;*/
    }

    private int[] ArrayRandom(int ConstValue, int ArrayLenght) {
        //random array
        final Random rand = new Random();
        int[] RandomArray = new int[ArrayLenght];

        for (int i = 0; i < ArrayLenght; i++) {
            RandomArray[i] = rand.nextInt(ConstValue);
        }

        return RandomArray;
    }

    private int Input(String Str) {
        //input method
        Scanner Scan = new Scanner(System.in);
        System.out.println(Str);
        int InputValue = -1;
        try {
            InputValue = Integer.parseInt(Scan.next());
            if (InputValue < 0 || InputValue > 100) {
                System.out.println("Enter a number from 0 to 100!");
                System.exit(0);
            }
        } catch (Exception ex) {
            System.out.println("Not correct value!");
            System.exit(0);
        }
        return InputValue;
    }

    public static void main(String[] args) {
        //initialization
        final int AmountOfElements = 100000;//общее каличество элементов массива
        final long Time1N, Time2N;//время выполнения сортировок
        long Start, Finish;//переменные для замерения времени
        Main ClassMain = new Main();//экземпляр класса
        final int ResultInput = ClassMain.Input("Please enter a number!");//ввод свого варианта
        final int RangeOfRandomNumbers = AmountOfElements + ResultInput * 1000;//диапазон рандмных чисел от 0 до const_value

        //Задание1:Сформувати масив з 10^5 випадкових цілих чисел з діапазону [0, 10^5+N*1000) (N – номер
        //варіанту за списком групи).
        //task1 генерация массива размером в 100000 и со значениями от 0(не включительно) до 10^5+И*1000
        final int[] ArrayRandom = ClassMain.ArrayRandom(RangeOfRandomNumbers, AmountOfElements);//генерация масива

        //Задание2:Порахувати кількість чисел у заданому масиві, що потрапляють у діапазон [N,2*N]
        //task2 каличестко чисел которые попадаю в диапазо от N до 2*N не включительно, в несортированом массиве
        //Start = System.nanoTime();
        final int ArrayLenght2to2N = ClassMain.CountNumbers(ResultInput, ArrayRandom) - 1;//длина от N до 2*N, -1 так как не включительно N и 2*N
        //Finish = System.nanoTime();
        //System.out.println(Finish - Start);

        /*
        Start = System.nanoTime();
        final int ArrayLenght2to2N2 = ClassMain.CountNumbers2(ResultInput, ArrayRandom) - 1;//длина от N до 2*N, -1 так как не включительно N и 2*N
        Finish = System.nanoTime();
        System.out.println(Finish - Start);
        */

        //Задание3:Визначити найменший індекс елементу масиву, що дорівнює 1000+N. Якщо масив не містить
        //такого елементу, вивести -1
        //task3 найти индекс элемента в несортированом массиве, элемент = 1000+N, если нет элемента то вазврат -1
        int WeightForValues = 1000 + ResultInput;
        int ArrayIndex = ClassMain.ArrayIndex(WeightForValues, ArrayRandom);//узнаем индекс элемента 1000+N

        //Задание4:Згідно варіанту, розробити програму, що виконує сортування створеного масиву. Метод
        //сортування обрати згідно таблиці. Виміряти час роботи алгоритму сортування.
        //task4 вызов алгоритмов сортировки массива
        final int ResultOfEnteringSortNumbre = ClassMain.Input("Enter number of sort!\n\t0:QuickSort\n\t1:BobbleSort\n\t2:SelectionSort\n\t3:InsertionSort");//выбор алгоритма сортировки

        //замеры времени выполнения сортировки масива 1
        Start = System.currentTimeMillis();
        final int[] ArraySortingDone = ClassMain.SortArray(ResultOfEnteringSortNumbre, ArrayRandom);
        Finish = System.currentTimeMillis();
        Time1N = Finish - Start;

        //Задание5:Згенерувати масив аналогічно до п. 1 збільшивши кількість елементів масиву у 2 рази.
        //Відсортувати новий масив методом з п.4. Порівняти час роботи сортування для двох масивів.
        //task5 генерация масива в 2N сортировка его и измерение времени работы масива
        final int[] ArrayRandom2 = ClassMain.ArrayRandom(RangeOfRandomNumbers, AmountOfElements * 2);

        //замеры времени выполнения сортировки масива 2
        Start = System.currentTimeMillis();
        final int[] ArraySortingDone2 = ClassMain.SortArray(ResultOfEnteringSortNumbre, ArrayRandom2);
        Finish = System.currentTimeMillis();
        Time2N = Finish - Start;

        //Задание6:Повторити завдання п.3 для відсортованого масиву, використовуючи алгоритм бінарного
        //пошуку. Порівняти кількість операцій порівнянь, які необхідно виконати для пошуку
        //елементу у впорядкованому та невпорядкованому масиві.
        //task6 с помощю бинарного поиска находим индекс элемента 1000+N и считаем каличество операций
        final int Number = 1000 + ResultInput;//сам елемент индекс которого нужно найти
        final int[] BnrySrchFindIndxAndCntOprtions = ClassMain.BinarySearch(ArraySortingDone, Number);//вызов метода бинарного поиска
        final int IndexOfElementSortedArray = BnrySrchFindIndxAndCntOprtions[0];//сам индекс
        final int NumberOfOperationsSortedArray = BnrySrchFindIndxAndCntOprtions[1];//каличество операций

        //вывод на печать/экран
        ClassMain.print(
                ResultInput,//результат ввода
                RangeOfRandomNumbers,//task1 каличество элементов масива
                ArrayLenght2to2N,//task2 длина от числа N до числа 2N
                ArrayIndex,//task3 индекс числа не сортированного масива
                IndexOfElementSortedArray,//task3 индекс числа сортированного масива
                Time1N,//task4 время сортировки масива 1(N)
                Time2N,//task5 время сортировки масива 1(2*N)
                NumberOfOperationsSortedArray,//task6 каличество операций в сортированом массиве
                ArraySortingDone,//отсортированный массив 1
                ArraySortingDone2);//отсортированный массив 2
        System.exit(0);
    }

    private int[] BinarySearch(int[] Array, int number) {//метод бинарного поиска
        int high = Array.length - 1;
        int low = 0;
        int mid;
        int count = 1;
        while (low <= high) {
            count++;
            mid = (low + high) / 2;
            if (Array[mid] == number) {
                return new int[]{mid, count};
            } else if (Array[mid] < number) {
                low = mid + 1;
            } else if (Array[mid] > number) {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    private int[] SortArray(int SortNumber, int[] ArrayNoSort) {
        //метод вызова сортировок
        Sorting sorting = new Sorting();
        int[] ArrayResult = new int[ArrayNoSort.length];
        System.out.println("Process...");
        switch (SortNumber)//выбор сортировки
        {
            case 0:
                ArrayResult = sorting.QuickSort(ArrayNoSort);//быстрая
                break;
            case 1:
                ArrayResult = sorting.BobbleSort(ArrayNoSort);//пузырьковая
                break;
            case 2:
                ArrayResult = sorting.SelectionSort(ArrayNoSort);//выбором
                break;
            case 3:
                ArrayResult = sorting.InsertionSort(ArrayNoSort);//вставками
                break;
            default:
                System.exit(0);
        }
        return ArrayResult;
    }

    private void print(
            int ResultInput,
            int RangeOfRandomNumbers,
            int ArrayLenght2to2N,
            int ArrayIndex,
            int IndexOfElementSortedArray,
            long Time1N,
            long Time2N,
            int NumberOfOperationsSortedArray,
            int[] ArraySortingDone,
            int[] ArraySortingDone2) {
        System.out.println("Number:" + ResultInput);
        System.out.println("Task 1:\tArray lenght:" + RangeOfRandomNumbers);
        System.out.println("Task 2:\tLenght from N to 2*N:" + ArrayLenght2to2N);
        System.out.println("Task 3:\t1000+N index:\n\t\t1-unsorted:" + ArrayIndex + "\n\t\t2-sorted:" + IndexOfElementSortedArray);
        System.out.println("Task 4:\tSorting time1:" + Time1N);
        System.out.println("Task 5:\tSorting time2:" + Time2N);
        System.out.println("Task 6:\tNumber of operation:\n\t\t1-Unsorted:" + ArrayIndex + "\n\t\t2-Sorted:" + NumberOfOperationsSortedArray);
        int NumberForPrintArray = Input("Do you want to see the array! Enter 0(no) or 1(yes)");
        if (NumberForPrintArray != 0) {
            NumberForPrintArray = Input("How array! Enter 0:(N) or 1:(2*N)");
            if (NumberForPrintArray == 0) {
                ArrayPrint(ArraySortingDone);
            } else if (NumberForPrintArray == 1) {
                ArrayPrint(ArraySortingDone2);
            } else System.exit(0);
        }
    }

    private void ArrayPrint(int[] array) {//процедура вывода массива
        for (int value : array) {
            System.out.println(value);
        }
    }
}