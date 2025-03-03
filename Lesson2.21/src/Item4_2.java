import java.util.Scanner;


public class Item4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:" );
        String input1 = scanner.nextLine();

        String input2 = input1
                .replace("кака", "вырезано цензурой")
                .replace("бяка", "вырезано цензурой");

        // Выводим результат
        System.out.println(input2);
    }
}

