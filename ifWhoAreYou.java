package WhoIsThis;
import java.util.Objects;
import java.util.Scanner;
public class ifWhoAreYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Назовите ваше имя: ");
        String name = scanner.nextLine();
        if (Objects.equals(name, "Вася")|Objects.equals(name, "Анастасия")) {
            if (Objects.equals(name,"Вася"))
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал!");
        }else {
                System.out.println("Добрый день, а вы кто?");

        }


    }
}
