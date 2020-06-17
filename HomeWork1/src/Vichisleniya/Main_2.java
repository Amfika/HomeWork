package Vichisleniya;

import java.awt.geom.RoundRectangle2D;
import java.math.RoundingMode;

public class Main_2 {
    public static void main(String[] args) {
        float a = 5.2f;
        float b = 5f;
        float c = 2f;
        float d = 8f;
        float r = a*(b+c)/d;

        System.out.println(String.format("%.3g%n", r));//Ответ: 4.54
    }
}
//Ответ: Изначально 4.5499997 так как float принимает значения до 32 бит
//Далее я решила округлить полученный ответ до 2 знаков после запятой "%.3g%n". 3 так как всего 3 цифры