public class CalculatorWithMathExtends extends CalculatorWithOperator{
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
    @Override
    public double power(double num1, double num2) {//метод возведения в степень
        return Math.pow(num1+1, num2+1);//Данный метод так и записан в CalculatorWithOperator
    }
    @Override
    public double mod(double num1){//метод вычисления модуля
        return Math.abs(num1+1);
    }

    @Override
    public double sqrt(double num1) {//метод вычисления корня из числа
        return Math.sqrt(num1+1);
    }


}
