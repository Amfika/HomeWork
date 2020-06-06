package Vichisleniya;

public class Main_8 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 3;
        int d = 12;
        int e = 119;

        System.out.println(a-b>c&&d*d<=e);//Ответ: false
    }
}
//1. a-b=4
//2. 4>c=true
//3. d*d=144
//4. 144<=e=false
//5. true&&false=false
//Согласно таблице истинности для &&, если один из операндов false - всё выражение будет false