import java.util.Random;

public class Sort_sheikernaya {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        //адгоритм
        int left = 1;
        int right = mas.length - 1;
        do {
            for (int i = right; i >= left; i--) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                }
            }
            left++;
            for (int i = left; i <= right; i++) {
                if (mas[i - 1] > mas[i]) {
                    int temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                }
            }
            right--;
        } while (left <= right);
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}