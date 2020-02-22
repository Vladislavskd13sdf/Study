package lab4;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main;
    @BeforeEach
    void setUp() {
        main=new Main();
    }

    @Test
    void TestCalculatedY() {
        double a=1.5;
        double b=4.5;
        double res=main.calculate(a,b);
        assertEquals(a,res,0.001,"y must be a x*x");
    }
}