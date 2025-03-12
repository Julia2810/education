import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Student {
    public void learn() {
        System.out.println("Я учусь. .zZ");
    }

    public void finishLearning() {
        System.out.println("Я закончил учиться");
    }
}

class StudentWithClock extends Student {
    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void finishLearning() {
        super.finishLearning();

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        System.out.println("Текущее время: " + formattedTime);
    }
}

public class Main {
    public static void main(String[] args) {
        StudentWithClock student = new StudentWithClock();
        student.learn();
        student.finishLearning();

    }
}