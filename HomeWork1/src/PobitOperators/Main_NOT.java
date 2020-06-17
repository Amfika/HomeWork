package PobitOperators;

public class Main_NOT {
    public static void main(String[] args) {
        int a = 42; //00101010
        int b = 15; //00001111
        int c = -42; //11010110
        int d = -15; //11110001

        System.out.println(~a);
        //Ответ: -43 (11010101). Исходное число *-1 и вычитаем -1.
        System.out.println(~b);
        //Ответ: -16 (11110000).
        System.out.println(~c); //-42*-1=42-1=41
        //Ответ: 41 (00101001).
        System.out.println(~d);
        //Ответ: 14 (00001110).
    }
}
