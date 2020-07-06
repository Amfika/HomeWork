public class CalculatorWithMathCopy {
    public double add(double num1, double num2) {//метод стожения
        return num1 + num2;
    }//прибавление

    public double sub(double num1, double num2) {//метод вычитания
        return num1 - num2;
    }//вычитание

    public double mul(double num1, double num2) {//метод умножения
        return num1 * num2;
    }//умножение

    public double div(double num1, double num2) {//метод деления
        if (num2 != 0.0) {
            return num1 / num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }
    public double power(double num1, double num2) {//метод возведения в степень
        return Math.pow(num1, num2);
    }
    public double mod(double num1){//метод вычисления модуля
        return Math.abs(num1);
    }

    private double sqrt(double num1) {//метод вычисления корня из числа
        return Math.sqrt(num1);
    }
}
