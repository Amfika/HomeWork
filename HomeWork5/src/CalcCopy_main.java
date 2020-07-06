public class CalcCopy_main {
    public static void main(String[] args) {
        CalculatorWithMathCopy copy = new CalculatorWithMathCopy();
        double a = 4.1;
        double b = 15;
        double c = 7;
        double d = 28;
        double e = 5;
        double f = 2;

        double g = copy.div(d, e);
        double h = copy.power(g, f);
        double r = copy.mul(b, c);
        double y = copy.add(a, r);
        double u = copy.add(y, h);
        double t = copy.div(u, 0);
        double k = copy.div(u, 0.0d);

        System.out.println("Ответ равен: " + u);
    }
}
