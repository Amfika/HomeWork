package PobitOperators;

public class Main_moveLeft {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;

        System.out.println(a << 2);
        //Ответ: 168 (10101000), т.к. сдвиг влево числа 42 (00101010) будет = 10101000
        System.out.println(b << 2);
        //Ответ: 60 (00111100), т.к. сдвиг влево числа 15 (00001111) будет = 00111100
        System.out.println(c << 2);
        //Ответ: -168 (01011000). Происходит умножение (-42*2)*2=-168. В переводе это 10101000 = 168
        System.out.println(d << 2);
        //Ответ: -60 (11000100). (-15*2)*2=-60

        //Сдвиг влево с присваиванием
        System.out.println(a <<= 2);//Сокращённое выражение от a = a << 2
        System.out.println(b <<= 2);
        System.out.println(c <<= 2);
        System.out.println(d <<= 2);

    }
}
