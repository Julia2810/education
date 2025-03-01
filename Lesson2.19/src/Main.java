import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три числа: ");
        int a = scanner.nextInt();

        int b = scanner.nextInt();

        int c = scanner.nextInt();


        if (a % 5 == 0) {
            System.out.println("a=" + a);
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
        }

        System.out.println("Результат целочисленного деления a на b: " + (a / b));

        System.out.println("Результат деления a на b: " + ((double) a / b));

        System.out.println("Результат деления a на b с округлением в большую сторону: " + Math.ceil((double) a / b));

        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floor((double) a / b));

        System.out.println("Результат деления a на b с математическим округлением: " + Math.round((double) a / b));

        System.out.println("Остаток от деления b на c: " + (b % c));

        System.out.println("Наименьшее значение из a и b: " + Math.min(a, b));

        System.out.println("Наибольшее значение из b и c: " + Math.max(b, c));
    }
}