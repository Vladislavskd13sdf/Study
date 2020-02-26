package lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {//задание:2
    private Main main;

    @BeforeEach
    void setUp() {
        main = new Main();
    }

    @Test
//задание:3
    void GetY1() {
        assertEquals(0.0873, main.GetY(0.7, -0.5, 2), 0.0001, "y=a*x^2*ln(x)");//проверка начала интервала
    }

    @Test
    void GetY2() {
        assertEquals(1, main.GetY(1.4, -0.5,2), 0.0001, "y=1");//проверка средины интервала
    }

    @Test
    void GetY3() {
        assertEquals(0.2142, main.GetY(3, -0.5,2), 0.0001, "y=e^(a*x)*cos(b*x)");//проверка конца интервала
    }

    @Test
//задание:4
    void GetCountStap() {
        assertEquals(751, main.GetCountStep(0,3, 0.004), 0.0001, "cnt=(max-min)/dx+1");//проверка каличества шагов
    }

    @Test
//задание:5
    void GetArrayStap1() {
        assertEquals(0.7, main.GetArrayStap(0,3, 0.004)[175], 0.01, "Array from 0.7");//проверка каличества шагов
    }

    @Test
    void GetArrayStap2() {
        assertEquals(1.4, main.GetArrayStap(0,3, 0.004)[350], 0.01, "Array from 1.4");//проверка каличества шагов
    }

    @Test
    void GetArrayStap3() {
        assertEquals(3, main.GetArrayStap(0,3, 0.004)[750], 0.01, "Array to 3");//проверка каличества шагов
    }

    //задание 6
    @Test
    void GetMinIndex() {
        assertEquals(1, main.GetMinIndex(new double[]{0.1245, 0.1146, 0.1447}), 0.1, "1");//найти минимальный индекс элемента
    }

    @Test
    void GetMaxIndex() {
        assertEquals(2, main.GetMaxIndex(new double[]{0.1245, 0.1346, 0.1447}), 0.1, "2");//найти максимальный индекс элемента
    }

    @Test
    void GetSumArray() {
        assertEquals(25, main.GetSumArray(new double[]{1, 5, 2, 5, 7, 2, 3}), 0.1, "25");//получить суму всех элементов
    }

    @Test
    void GetMean() {
        assertEquals(5, main.GetMean(new double[]{5, 5, 7, 3}), 0.0001, "5");//получить среднее арифметическое элементов
    }
}