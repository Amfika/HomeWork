import java.util.Scanner;//подключаем для считывания введённых параметров в консоли

public class UmnozenieArgument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//создаем новы объект
        System.out.println("Введите число");
        int a = scanner.nextInt();//считывает и возвращается введённое значение
        System.out.print(calculateFactorial(a));//в итоге возвращается подсчёт из метода ниже
    }

    static int calculateFactorial(int n) {//метод, который вычисляет факториал из а. n-получает
        //от calculateFactorial(a) число для обработки в методе
        int b = 1;//создали переменную с начальным значением
        for (int i = 1; i <= n; i++) {//цикл перемножает числа от 1 до а
            b = b * i;//1*1, 1*2, 2*3
        }
        return b;
    }


}

