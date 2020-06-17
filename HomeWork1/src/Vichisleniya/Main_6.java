package Vichisleniya;

public class Main_6 {
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

        System.out.println(a * (b+c>d?h:j*e>>++f)/--g);//Ответ: 4
    }
}
//1. ++f = 3
//2. b+c = 12
//3. 12>d = false = 22
//4. 22*2 = 44 = 00101100
//5. 00101100 >> 3 = 00000101 = 5
//6. а*5 = 28
//7. --g = 7
//8. 28/7 = 4