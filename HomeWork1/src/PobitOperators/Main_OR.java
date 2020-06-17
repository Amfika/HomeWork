package PobitOperators;

public class Main_OR {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;

        System.out.println(a | b); //конкатенация. Если в одном из битов есть 1-переносим её.
        //Ответ: 47 (00101111). 00101010 (42) | 00001111 (15) = 00101111 (47)
        System.out.println(c | d);
        //Ответ: -9 (11110111).

        //OR с присваиванием
        System.out.println(a |= b); //Сокращённая формула a = a | b
        System.out.println(c |= d);



    }
}
