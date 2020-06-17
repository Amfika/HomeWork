package Vichisleniya;

public class Main_5 {
    public static void main(String[] args) {
        float a = 5.5f;
        int b = 5;
        int c = 2;
        int d = 8;
        int f =2;

        System.out.println(String.format("%.3g%n", a *(b*f >> ++c)/--d));//Ответ: 0,786
    }
}
//1. ++с = 3
//2. b*f = 10 (00001010)
//3. сдвигаем вправо на 3 знака = 00000001 = 1
//4. а * 1 = 5.5
//5. --d = 7
//6. 5.5 / 7 = 0.786