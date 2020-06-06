package Vichisleniya;

public class Main_4 {
    public static void main(String[] args) {
        float a = 5.4f;
        float b = 5f;
        float c = 2f;
        float d = 8f;
        float e = a*(b+(++c))/--d;

        System.out.println(String.format("%.3g%n", e));//Ответ: 6,17
    }
}
//Ошибка с переменной С из прошлого примера с++ - переделала на ++с
//Далее происходит прибавление b + с
//Затем происходит умножение а на сумму (b+c)
//Далее отнимается от d единица (--d)
//Последним идёт деление
//Также округлила в ответе до 2 знаков после точки