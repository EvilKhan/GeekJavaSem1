//Написать программу, которая попросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");

        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");
    }
}