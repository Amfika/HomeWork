package WhoIsThis;

import java.util.Scanner;
public class switchWho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Назовите ваше имя: ");
        String a = scanner.nextLine();
        switch (a){
            default:
                System.out.println("Здравствуйте, а вы кто?");
                break;
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал!");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал!");
                break;
        }
        }
    }

