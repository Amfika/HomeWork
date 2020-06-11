import java.util.Scanner;
public class RazbienieChisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();

        int sum = 1;
        while (a != 0) {
            int i = a % 10;
            a /= 10;
            sum=sum*i;
            System.out.print(i+" ");
        }
        System.out.println("Sum = "+sum);


    }
}
