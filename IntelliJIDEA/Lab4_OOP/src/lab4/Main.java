package lab4;

import static java.lang.Math.*;

public class Main {//task1

    public static void main(String[] args) {

    }

    public double Calculated(double a, double b) {//task3
        double y = 0;
        for(double x=0.004;x<3;x+=0.004)
        {
            if(x>0.7&&x<=1.4) {
                y = a * pow(x, 2) * log(x);
            }
            if (x<=0.7){
                y=1;
            }
            if(x>1.4){
                y=exp(a*x)*cos(b*x);
            }

        }
        return y;
    }
}
