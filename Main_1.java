package Vichisleniya;

public class Main_1 {
    public static void main(String[] args) {
        float a = 5.15f;//указываем суффикс f, так как программа без него будет думать, что это double
        float b = 2f;
        float c = 8f;

        System.out.println(a + b / c);
    }
}
//Изначально выполняется деление: 2/8=0,25. Для того, чтобы у нас выдалось число с остатком, записываем его в float.
//Далее выполняется сложение чисел с плавающей точкой 5.15+0.25=5.40 или 5.4