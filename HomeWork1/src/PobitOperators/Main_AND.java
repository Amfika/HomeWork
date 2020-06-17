package PobitOperators;

public class Main_AND {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;

        System.out.println(a & b); //Применение конкатенации. Где биты совпадают-дублируем
        //Ответ: 10 (00001010). 00101010 (42) и 00001111 (15) = 00001010 = 10
        System.out.println(c & d);
        //Ответ: -48 (11010000).

        //AND с присваиванием
        System.out.println(a &= b); //сокращённая формула от a = a & b
        System.out.println(c &= d);

    }
}
