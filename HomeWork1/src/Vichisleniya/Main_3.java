package Vichisleniya;

public class Main_3 {
    public static void main(String[] args) {
        float a = 5.3f;
        float b = 5f;
        float c = 2f;
        float d = 8f;
        float e = a*(b+(++c))/d;//Ошибка в начальном премере как с++, так как изначально мы должны
        //увеличить значение с, а потом его использовать, а не наоборот.

        System.out.println(e);//Ответ: 5.3
    }
}
