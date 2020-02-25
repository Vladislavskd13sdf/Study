package lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {//задание:2
    private Main main;
    private double a, b;
    //private double delta;
    private double minX, maxX, dx;
    private int n1, n2, n3;
    private double x1, x2, x3;


    @BeforeEach
    void setUp() {
        main = new Main();
        a = -0.5;
        b = 2;
        //delta=0.001;
        minX = 0;
        maxX = 3;
        dx = 0.004;//жиапазоны значений Х и шаг
        n1 = 175;
        n2 = 350;
        n3 = 750;//номер элемента для тестирования
        x1 = dx * n1;
        x2 = dx * n2;
        x3 = dx * n3;//сам элемент для тестирования
    }

    @Test
//задание:3
    void GetY1() {
        assertEquals(0.08738536126498943, main.GetY(x1, a, b), 0.004, "y=a*x^2*ln(x)");//проверка начала интервала
    }

    @Test
    void GetY2() {
        assertEquals(1, main.GetY(x2, a, b), 0.004, "y=1");//проверка средины интервала
    }

    @Test
    void GetY3() {
        assertEquals(0.21424294983005993, main.GetY(x3, a, b), 0.004, "y=e^(a*x)*cos(b*x)");//проверка конца интервала
    }

    @Test
//задание:4
    void GetCountStap() {
        assertEquals(751, main.GetCountStep(minX, maxX, dx), 0.004, "cnt=(max-min)/dx+1");//проверка каличества шагов
    }

    @Test
//задание:5
    void GetArrayStap1() {
        assertEquals(x1 + minX, main.GetArrayStap(minX, maxX, dx)[n1], 0.004, "Array from 0.7");//проверка каличества шагов
    }

    @Test
    void GetArrayStap2() {
        assertEquals(x2 + minX, main.GetArrayStap(minX, maxX, dx)[n2], 0.004, "Array from 1.4");//проверка каличества шагов
    }

    @Test
    void GetArrayStap3() {
        assertEquals(x3 + minX, main.GetArrayStap(minX, maxX, dx)[n3], 0.004, "Array to 3");//проверка каличества шагов
    }

    //задание 6
    @Test
    void GetMinIndex() {
        assertEquals(1, main.GetMinIndex(new double[]{0.1245, 0.1146, 0.1447}), 0.004, "1");//найти минимальный индекс элемента
    }

    @Test
    void GetMaxIndex() {
        assertEquals(2, main.GetMaxIndex(new double[]{0.1245, 0.1346, 0.1447}), 0.004, "2");//найти максимальный индекс элемента
    }

    @Test
    void GetSumArray() {
        assertEquals(25, main.GetSumArray(new double[]{1, 5, 2, 5, 7, 2, 3}), 0.004, "25");//получить суму всех элементов
    }

    @Test
    void GetMean() {
        assertEquals(5, main.GetMean(new double[]{5, 5, 7, 3}), 0.004, "5");//получить среднее арифметическое элементов
    }
}