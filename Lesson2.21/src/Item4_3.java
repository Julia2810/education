import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Item4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String date1 = scanner.nextLine();

        DateTimeFormatter date2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate date3 = LocalDate.parse(date1, date2);

        System.out.println(date3);
    }
}

