package lab4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {//task2
    Main main;
    @BeforeEach
    void setUp() {
        main=new Main();
    }

    @Test
    void TestCalculated(){//task3
        double a=-0.5;
        double b=2;
        double res=main.Calculated(a,b);
        assertEquals(0.21416523363573306,res,0.004,"y must be a x*x");
    }
}