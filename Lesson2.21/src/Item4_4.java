import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Item4_4 {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате 'дд.мм.гггг':");
        String date1 = scanner.nextLine();

        SimpleDateFormat getDateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat setNewDateFormatter = new SimpleDateFormat("yyyy-MM-dd");

        Date date2 =  getDateFormatter.parse(date1);

        System.out.println(setNewDateFormatter.format(date2));
    }
}


