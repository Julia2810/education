import java.util.*;

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

    // Метод toString()
    @Override
    public String toString() {
        return name + ", возраст " + age + " лет";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, List<User>> userMap = new HashMap<>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя " + (i+1) + " пользователя ");
            String name = scanner.nextLine();

            System.out.println("Введите возраст " + (i+1) + " пользователя ");
            Integer age = Integer.parseInt(scanner.nextLine());

            User user = new User(name, age);
            userMap.putIfAbsent(age, new ArrayList<>());
            userMap.get(age).add(user);
        }


        System.out.println("Введите требуемый возраст");
        Integer searchAge = Integer.parseInt(scanner.nextLine());


        if (userMap.containsKey(searchAge)) {
            List<User> users = userMap.get(searchAge);
            users.sort(Comparator.comparing(User::getName));


            for (User user : users) {
                System.out.println(user);
            }
        } else {
            System.out.println("Пользователь с возрастом " + searchAge + " не найден");
        }

        scanner.close();
    }
}