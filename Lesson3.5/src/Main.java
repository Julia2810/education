import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class User {
    private String name;
    private Integer age;

    // Конструктор
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для age
    public Integer getAge() {
        return age;
    }

    // Сеттер для age
    public void setAge(Integer age) {
        this.age = age;
    }

    // Метод toString
    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя пользователя " + (i + 1)+" ");
            String name = scanner.nextLine();

            System.out.print("Введите возраст пользователя " + (i + 1)+" ");
            Integer age = scanner.nextInt();
            scanner.nextLine();

            User user = new User(name, age);
            userList.add(user);
        }


        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getAge().compareTo(u2.getAge());
            }
        });



        for (User user : userList) {
            System.out.println(user);
        }

        scanner.close();
    }
}