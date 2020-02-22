import java.text.SimpleDateFormat;
import java.util.*;
import static java.lang.Math.*;
public class DataMath {
    private void output_value(double a, double b, double x, double R, double s) {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("R = " + R);
        System.out.println("s = " + s);
    }
    private void outData() {
        SimpleDateFormat simpleDate = new SimpleDateFormat("ss-MM-hh yyyy-mm-dd");
        Date dateNow = new Date();
        System.out.println("Date:" + simpleDate.format(dateNow));
    }
    private double input_value() {
        System.out.println("Enter value:");
        return new Scanner(System.in).nextDouble();
    }
    private double calculateR(double a, double b, double x) {//обчислення значень
        return Math.pow(x, 2) * (x + 1) / b - pow(Math.sin(x + a), 2);
    }
    private double calculateS(double a, double b, double x) {//обчислення значень
        return Math.sqrt(x * b / a) + pow(Math.cos(pow(x + b, 3)), 2);
    }
    private void autoValue() {
        double a = randomValue();
        double b = randomValue();
        double x = randomValue();
        double R = calculateR(a, b, x);
        double s = calculateS(a, b, x);
        output_value(a, b, x, R, s);
    }
    private double randomValue() {
        return new Random().nextDouble();
    }
    public static void main(String[] args) {
        DataMath datamath = new DataMath();
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, x = 0, R, s;
        System.out.println("Enter 'r' for random numbers and 'i' for input numbers!");
        String first_input = scanner.next();
        if (first_input.toLowerCase().equals("r")) {
            datamath.autoValue();
        } else {
            a = datamath.input_value();
            b = datamath.input_value();
            x = datamath.input_value();
            R = datamath.calculateR(a, b, x);
            s = datamath.calculateS(a, b, x);
            datamath.output_value(a, b, x, R, s);
        }
        datamath.outData();
    }
}
