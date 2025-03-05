import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy");

        //Вводим первую дату
        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String inputDate = scanner.nextLine();
        Date date1 = date.parse(inputDate);

        // Увеличиваем на 45 дней
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.add(Calendar.DAY_OF_MONTH, 45);
        Date datePlus45Days = calendar.getTime();
        System.out.println("Дата после увеличения на 45 дней: " + date.format(datePlus45Days));

        // Сдвигаем на начало года
        calendar.setTime(date1);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        Date startOfYear = calendar.getTime();
        System.out.println("Дата после сдвига на начало года: " + date.format(startOfYear));

        // Увеличиваем на 10 рабочих дней
        Date datePlus10WorkingDays = date1;
        int days = 0;
        while (days < 10) {
            calendar.setTime(datePlus10WorkingDays);
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            datePlus10WorkingDays = calendar.getTime();

            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
                    calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                days++;
            }
        }
        System.out.println("Дата после увеличения на 10 рабочих дней: " + date.format(datePlus10WorkingDays));

        // Вводим вторую дату
        System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
        String inputSecondDate = scanner.nextLine();
        Date date2= date.parse(inputSecondDate);

        // Разница в рабочих днях между первой и второй датой
        int workingDaysBetween = 0;
        Calendar startDate = Calendar.getInstance();
        startDate.setTime(date1);

        Calendar endDate = Calendar.getInstance();
        endDate.setTime(date2);


        if (startDate.after(endDate)) {
            Calendar cal = startDate;
            startDate = endDate;
            endDate = cal;
        }

        while (startDate.before(endDate) || startDate.equals(endDate)) {

            if (startDate.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
                    startDate.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                workingDaysBetween++;
            }
            startDate.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println("Количество рабочих дней между введенными датами: " + workingDaysBetween);
    }
}
