public class Sort_sliyaniem {
    public static void main(String[] args) {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) Math.round(Math.random() * 10);
            System.out.print(mas[i] + " ");
        }
        //Алгоритм
        int d = mas.length / 2; //длина массива на 2
        while (d > 0) {
            for (int i = 0; i < (mas.length - d); i++) {
                int j = i;//j=0
                while ((j >= 0) && (mas[j] > mas[j + d])) {
                    //mas[0]>mas[0+5]
                    int temp = mas[j];
                    mas[j] = mas[j + d];
                    mas[j + d] = temp;
                    j--;
                }
            }
            d = d / 2;

            //выводим массив вконце
            System.out.println();
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}