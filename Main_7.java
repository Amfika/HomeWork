package Vichisleniya;

public class Main_7 {
    public static void main(String[] args) {
        float a = 5.6f;
        int b = 5;
        int c = 7;
        int d = 20;
        int e = 2;
        int f = 2;
        int g = 8;
        int h = 68;
        int j = 22;

        System.out.println(a*(b+c>d?h^=h:j*e>>++f)/--g);//Ответ: 4.0
    }
}

//Оператор  h=>h заменила на h^=h для того, чтобы, при значении true, оставалось значение 68
