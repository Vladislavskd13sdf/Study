package lab4;

import static java.lang.Math.*;

public class Main {//задание:1
    private double minX, maxX, dx, a, b;

    public Main(double minX, double maxX, double dx, double a, double b) {
        this.a = a;
        this.b = b;
        this.dx = dx;
        this.maxX = maxX;
        this.minX = minX;
    }

    public Main() {
    }

    public static void main(String[] args) {
        Main main = new Main(0, 3, 0.004, -0.5, 2);
        main.PrintMinElementAndIndex(0, 3, 0.004, -0.5, 2);
        main.PrintMaxElementAndIndex(0, 3, 0.004, -0.5, 2);
    }

    public double GetY(double x, double a, double b) {//получить Y
        double delta = 0.001;//погрешность
        if (x <= 0.7 + delta && x > 0) {
            return (a * pow(x, 2) * log(x));
        } else if (x > 0.7 + delta && x <= 1.4 + delta) {
            return 1;
        } else {
            return (exp(a * x) * cos(b * x));
        }
    }

    public int GetCountStep(double min, double max, double dx) {//каличество шагов
        return (int) ((max + min) / dx);
    }

    public double[] GetArrayStap(double min, double max, double dx)//получить массив шагов
    {
        double[] ArrayStap = new double[GetCountStep(min, max, dx)];
        int stap = 0;
        while (min + stap * dx <= max) {
            ArrayStap[stap] = min + stap * dx;
            stap++;
        }
        return ArrayStap;
    }

    //задание 5
    public double[] GetArrayY(double min, double max, double dx, double a, double b)//получаем масив значений функции на каждом шагу
    {
        double[] ArrayStap = GetArrayStap(min, max, dx);
        double[] ArrayY = new double[GetCountStep(min, max, dx)];
        for (int i = 0; i < ArrayY.length; i++) {
            ArrayY[i] = GetY(ArrayStap[i], a, b);
        }
        return ArrayY;
    }

    //задание 6
    public int GetMinIndex(double[] Array) {
        int minIdex = 0;
        double minValue = Array[minIdex];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] < minValue) {
                minValue = Array[i];
                minIdex = i;
            }
        }
        return minIdex;
    }

    public int GetMaxIndex(double[] Array) {
        int maxIdex = 0;
        double maxValue = Array[maxIdex];
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > maxValue) {
                maxValue = Array[i];
                maxIdex = i;
            }
        }
        return maxIdex;
    }

    public double GetSumArray(double[] Array) {
        double sum = 0;
        for (double item : Array) {
            sum += item;
        }
        return sum;
    }

    public double GetMean(double[] Array) {
        return GetSumArray(Array) / Array.length;
    }

    //задание 7
    private void PrintMinElementAndIndex(double min, double max, double dx, double a, double b) {
        double[] Array = GetArrayY(min, max, dx, a, b);
        int Index = GetMinIndex(Array);
        System.out.println("Min index:" + Index + "\nMin value:" + Array[Index]);
    }

    private void PrintMaxElementAndIndex(double min, double max, double dx, double a, double b) {
        double[] Array = GetArrayY(min, max, dx, a, b);
        int Index = GetMaxIndex(Array);
        System.out.println("Max index:" + Index + "\nMax value:" + Array[Index]);
    }
}
