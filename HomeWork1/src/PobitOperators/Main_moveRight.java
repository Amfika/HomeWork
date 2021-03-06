package PobitOperators;

public class Main_moveRight {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        int c = -42;
        int d = -15;

        System.out.println(a = a >> 2);
        //Ответ: 10 т.к. 00101010 (42) сдвигаем на 2 бита вправо, слева дописываем 00. Итог 00001010
        System.out.println(b = b >> 2);
        //Ответ: 3 (00000011).
        System.out.println(c = c >> 2); // при работе с отрицательными числами - дописываем 11
        //Ответ: -11 (11110101). Перевод в положительное число без последней 1 = 00001011 = 11.
        System.out.println(d = d >> 2);
        //Ответ: -4 (11111100). -15>>2=11111100

        //Сдвиг вправо с присваиванием
        System.out.println(a >>= 2);
        //Ответ: 2 (00000010) т.к. в предыдущем операторе переменная а получила значение 10 (00001010)
        System.out.println(b >>= 2);
        //Ответ: 0 (00000000) т.к. в предыдущем операторе b = 3 (00000011).
        System.out.println(c >>= 2);
        //Ответ: -3 (11111101). Предыдущее значение с сдвигаем на 2 вправо.
        System.out.println(d >>= 2);
        //Ответ: -1 (11111111). Также исходим из прошлого значение -4 (11111100).

        //Сдвиг вправо с заполнением нулями
        System.out.println(a >>> 2);
        //Ответ: 0 (00000000 00000000 00000000 00000000). Отталкиваемся от предыдущего значения 2 (00000010)
        System.out.println(b >>> 2);
        //Ответ: 0 (00000000 00000000 00000000 00000000). Отталкиваемся от предыдущего значения 0 (00000000)
        System.out.println(c >>> 2);//Исходник -3 (11111101)
        //Ответ: 1073741823 (11111111 11111111 11111111 11111111). В отрицательных 0 заменяется на 1
        System.out.println(d >>> 2);//Исходник -1 (11111111)
        //Ответ: 1073741823.


        //Сдвиг вправо с заполнением нулями с присваиванием
        System.out.println(a >>>= 2);//Сокращение формулы a = a >>> 2
        System.out.println(b >>>= 2);
        System.out.println(c >>>= 2);
        System.out.println(d >>>= 2);

    }
}
