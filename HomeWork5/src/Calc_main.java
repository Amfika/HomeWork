import java.util.Scanner;

public class Calc_main {
    public static void main(String[] args) {
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double f = 2;

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();//вместо static метода
        //экземпляр класса CalculatorWithOperator

        double g = calculatorWithOperator.div(d, e);
        double h = calculatorWithOperator.power(g, f);
        double r = calculatorWithOperator.mul(b, c);
        double y = calculatorWithOperator.add(a, r);
        double u = calculatorWithOperator.add(y, h);
        double t = calculatorWithOperator.div(u, 0);
        double k = calculatorWithOperator.div(u, 0.0d);

        double num1 = CalculatorWithOperator.getNumber();
        double num2 = CalculatorWithOperator.getNumber();
        char operation = CalculatorWithOperator.getOperation();
        double result = calculatorWithOperator.calc(num1, num2, operation);
        System.out.println("Результат:" + result);
        //double result2 = calculatorWithOperator.power(calculatorWithOperator.add((calculatorWithOperator.add(a, (calculatorWithOperator.mul(b,c)))), calculatorWithOperator.div(d,e))),f);
        System.out.println("Ответ равен: " + u);
        //System.out.println("Результат деления на 0: " + t);//результат NaN. "На 0 делить нельзя"
        //System.out.println("Результат деления на 0.0d: " + k); //результат NaN. "На 0 делить нельзя"






    }
}
