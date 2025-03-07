import java.util.Scanner;

class User {
    private String name;
    private Integer age;


    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите имя первого пользователя: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите возраст первого пользователя: ");
        Integer age1 = scanner.nextInt();
        scanner.nextLine();


        User user1 = new User(name1, age1);


        System.out.print("Введите имя второго пользователя: ");
        String name2 = scanner.nextLine();
        System.out.print("Введите возраст второго пользователя: ");
        Integer age2 = scanner.nextInt();


        User user2 = new User(name2, age2);


        if (user1.getAge() < user2.getAge()) {
            System.out.println(user1);
        } else {
                System.out.println(user2);
        }


        scanner.close();
    }

}