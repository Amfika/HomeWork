import java.util.Scanner;

public class HanoiTowers {
        char spire1; // Первый штырь
        char spire2; // Второй штырь
        char spire3; // Третий штырь
        int n; // Для хранения ввода кол-ва дисков с консоли
        HanoiTowers(){
            spire1 = 'A'; // Присвоение названий столбикам
            spire2 = 'B';
            spire3 = 'C';
            System.out.print("Введите количество дисков n = "); // Пользователь вводит кол-во дисков
            Scanner con = new Scanner(System.in); // Создание нового объекта
            n = con.nextInt(); // Хранит введённое значение
            System.out.println("\nОписание, как переложить " + n + " дисков со столбика А на В через промежуточный С");
            System.out.println("(Нумерация дисков - сверху вниз)");
        }
        // Конструктор HanoiTowers

        void moveDisks(int m, char source, char destination, char temporary){ // функция с параметрами
            if (m == 1){ // изначально m - это 3. Пока не будет 1 - условие не будет выполняться
                System.out.printf("%s %d %s %c %s %c%n" , "диск", m, "со столбика",source, "на столбик", destination);
            }
            else{
                moveDisks(m-1, source, temporary, destination); // поднимается выше на кольцо
                System.out.printf("%s %d %s %c %s %c%n" , "диск", m, "со столбика",source, "на столбик", destination);
                moveDisks(m-1, temporary, destination, source);
            }
        }
        // Перемещение дисков
        void moveDisksWrapper(){
            moveDisks(n, spire1, spire2, spire3);
        }
    }
    class ProblemHT {
        public static void main(String[] args) {
            HanoiTowers ht = new HanoiTowers();
            ht.moveDisksWrapper();
        }
    }
