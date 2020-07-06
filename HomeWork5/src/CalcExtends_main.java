public class CalcExtends_main {
    public static void main(String[] args) {

        CalculatorWithMathExtends exten = new CalculatorWithMathExtends();
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double f = 2;

        double g = exten.div(d, e);
        double h = exten.power(g, f);
        double r = exten.mul(b, c);
        double y = exten.add(a, r);
        double u = exten.add(y, h);
        double t = exten.div(u, 0);
        double k = exten.div(u, 0.0d);

        System.out.println("Ответ равен: " + u);
        System.out.println("Ответ равен: " + t);
        System.out.println("Ответ равен: " + k);
    }
}