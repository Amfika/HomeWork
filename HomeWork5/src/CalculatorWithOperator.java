import java.util.Scanner;
public class CalculatorWithOperator {
    public static double getNumber() { //метод получения чисел
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if(sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return getNumber();
        }
    }

    public static char getOperation() {//метод вызова требуемой операции
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить\n5 - возвести в степень\n6 - вычислить модуль числа\n7 - вычислить корень из числа");
        int operationNumber;
        if(sc.hasNextInt()) {//если вводим число
            operationNumber = sc.nextInt();
        } else { //если не число
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            case 5:
                return '^';
            case 6:
                return '!';
            case 7:
                return ',';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }

    public double add(double num1, double num2) {//метод стожения
        return num1+num2;
    }//прибавление

    public double sub(double num1, double num2) {//метод вычитания
        return num1-num2;
    }//вычитание

    public double mul(double num1, double num2) {//метод умножения
        return num1*num2;
    }//умножение

    public double div(double num1, double num2) {//метод деления
        if(num2 != 0.0) {
            return num1/num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }
    public double power(double num1, double num2) {//метод возведения в степень
        double result = 1;
        for (int i = 0; i <= num2; i++){
            result *= num1;
        }
        return result;
    }
    public double mod(double num1){//метод вычисления модуля
        if(num1 < 0){
            return -(num1);
        }else{
            return num1;
        }
    }

    public double sqrt(double num1) {//метод вычисления корня из числа
        return Math.sqrt(num1);
    }

    public double calc(double num1, double num2, char operation) {//вывод результата
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            case '^':
                return power(num1, num2);
            case '!':
                return mod(num1);
            case ',':
                return sqrt(num1);
            default:
                return Double.NaN;
        }


    }
}

