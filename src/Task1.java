//Настроить проект, вывести в консоль “Hello world!”.
//Вывести в консоль системные дату и время.
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Hello");

        Date date = new Date();
        System.out.println(date);

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("Дата: dd.MMMM.yyyy г., время: hh ч. mm мин. ss сек.");
        System.out.println(formatter.format(now));

        System.out.println();
        System.out.println(LocalDateTime.now());
    }
}