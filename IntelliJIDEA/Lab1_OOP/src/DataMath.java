//variat 1

import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Math.pow;

public class DataMath {


    private void output_value(double[] output_res, double[] ResultInput) {
        //task2
        //Доповнити клас методом, що виводить на екран значення вхідних
        //даних і результати обчислень, супроводжуючи вивід найменуваннями
        //виведених змінних.
        String[] str = {
                "a = ",
                "b = ",
                "x = ",
                "R = ",
                "s = "};
        System.out.println(str[3] + output_res[0]);
        System.out.println(str[4] + output_res[1]);
        System.out.println(str[0] + ResultInput[0]);
        System.out.println(str[1] + ResultInput[1]);
        System.out.println(str[2] + ResultInput[2]);


    }

    private void outData() {
        //task3
        //Додати в клас метод, що друкує поточну дату і час у вказаному
        //форматі.
        SimpleDateFormat simpleDate = new SimpleDateFormat("ss-MM-hh yyyy-mm-dd");
        Date dateNow = new Date();
        System.out.println("Date:" + simpleDate.format(dateNow));
    }

    private double input_value() {
        //task4
        //Доповнити клас методом введення початкових значень
        double enter;
        System.out.println("Enter value.");
        Scanner scan = new Scanner(System.in);
        enter = scan.nextDouble();
        return enter;
    }

    private double[] calculate(double[] inputs) {//обчислення значень
        double a = inputs[0];
        double b = inputs[1];
        double x = inputs[2];
        double R = Math.pow(x, 2) * (x + 1) / b - pow(Math.sin(x + a), 2);
        double s = Math.sqrt(x * b / a) + pow(Math.cos(pow(x + b, 3)), 2);
        return new double[]{R, s};
    }

    private void autoValue() {
        //task5
        //Створити метод, що вводить дані, обчислює потрібні значення за
        //вказаними формулами, та друкує потрібні результати.
        double[] randValue = randomValue();
        double[] calcDone = calculate(randValue);
        output_value(calcDone, randValue);
    }

    public static void main(String[] args) {
        //task6
        //Доповнити клас методом main, що є необхідним для використання
        //класу, як автономної програми, та виконати цю програму
        DataMath datamath = new DataMath();
        Scanner scanner = new Scanner(System.in);
        double[] inputs = new double[3];
        System.out.println("Enter 'r' for random numbers and 'i' for input numbers!");
        String first_input = scanner.next();
        if (first_input.toLowerCase().equals("r")) {
            datamath.autoValue();
        } else {
            for (int i = 0; i < 3; i++) {
                inputs[i] = datamath.input_value();
            }
            double[] done_calc = datamath.calculate(inputs);
            datamath.output_value(done_calc, inputs);
        }
        datamath.outData();
    }

    private double[] randomValue() {
        Random rand = new Random();
        //task1
        //Створити клас, що має методи для обчислення на ЕОМ значень
        //змінних, що зазначені у таблиці варіантів, за даними розрахунковими
        //формулами і наборами вхідних даних.
        double a = rand.nextDouble();
        double b = rand.nextDouble();
        double x = rand.nextDouble();
        return new double[]{a, b, x};
    }

}
