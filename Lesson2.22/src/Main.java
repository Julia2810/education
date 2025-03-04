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
        Date datePlus10WorkingDays = addWorkingDays(date1, 10);
        System.out.println("Дата после увеличения на 10 рабочих дней: " + date.format(datePlus10WorkingDays));

        // Вводим вторую дату
        System.out.println("Введите вторую дату в формате dd.MM.yyyy:");
        String inputSecondDate = scanner.nextLine();
        Date date2= date.parse(inputSecondDate);

        // Разница в рабочих днях между первой и второй датой
        int workingDaysBetween = countWorkingDays(date1, date2);
        System.out.println("Количество рабочих дней между введенными датами: " + workingDaysBetween);
    }

    public static Date addWorkingDays(Date date, int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        while (days > 0) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
                    calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                days--;
            }
        }
        return calendar.getTime();
    }

    public static int countWorkingDays(Date startDate, Date endDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        int workingDays = 0;

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
                    calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                workingDays++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        return workingDays;
    }
}