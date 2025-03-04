import java.util.Scanner;

public class Item4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:" );
        String one = scanner.nextLine();

        System.out.println("Введите подстроку:" );
        String two = scanner.nextLine();

        int counter = 0;

        int index = 0;

        while (index != -1) {
            index = one.indexOf(two, index);

            if (index != -1) {
                counter++;
                index+=two.length();
            }
        }

        System.out.println("Подстрока '" + two + "' встречается " + counter + " раза");
    }
}

