package PobitOperators;

public class Main_withoutOR {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;

        //исключающее OR
        System.out.println(a ^ b); //конкатенация. Совпадающие 1-ные биты переносятся как 0. Если в одном из битов встречается 1-переносим её.
        //Ответ: 37 (00100101).
        System.out.println(c ^ d);
        //Ответ: 39 (00100111).

        //исключающее OR с присваиванием
        System.out.println(a ^= b); // сокращённая фотрмула a = a ^ b
        System.out.println(c ^= d);
    }
}
