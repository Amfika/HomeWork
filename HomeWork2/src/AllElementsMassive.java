import java.util.Scanner;

public class AllElementsMassive {
    public static void main(String[] args) {
        /*int[] nums = new int[] {1,2,3,4,5};
        for (int i = 0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        int[] nums = new int[] {1,2,3,4,5};
        for (int i : nums) {
            System.out.print(i+" ");
        }*/
        /*----------------------------------------------------------------------------------------------*/
        /*int[] myArray; //объявление массива
        myArray = new int[5]; // создание, то есть, выделение памяти для массива на 5 элементов типа int
        System.out.println(myArray.length); // вывели в консоль длину массива, то есть количество элементов
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        for (int i = 0; i < 4; i++) {
            System.out.print(myArray[i] + " ");
        }*/
        /*---------------------------------------for----------------------------------------------------*/
        /*Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Ввести элементы массива: ");
        //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Массив состоит из следующих значений: ");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }*/
        /*------------------------------------foreach-----------------------------------------------------*/
        /*Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Ввести элементы массива: ");
        //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Массив состоит из следующих значений: ");
        for (int i : array) {
            System.out.print (i+" "); // Выводим на экран, полученный массив
        }*/
        /*------------------------------------while----------------------------------------------*/
        /*Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size]; // Создаём массив int размером в size
        System.out.println("Ввести элементы массива: ");
        //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Массив состоит из следующих значений: ");
        int i = 1;
        while (i < size+1) {
            System.out.print (i+" "); // Выводим на экран, полученный массив
            i++;
        }*/
        /*----------------------------do-while----------------------------------------------------*/
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int[] array = new int[size]; // Создаём массив int размером в size
        System.out.println("Ввести элементы массива: ");
        //Пройдёмся по всему массиву, заполняя его
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Массив состоит из следующих значений: ");
        int i = 1;
        do{
            System.out.print (i+" "); // Выводим на экран, полученный массив
            i++;
        } while (i < size+1);
    }
}