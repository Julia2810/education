import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StudentWithTime implements Learner {

    final Learner learner;

    public StudentWithTime(Learner learner) {
        this.learner = learner;
    }

    @Override
    public void learn() {
        learner.learn();
        LocalTime now = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.printf("Текущее время: %s", now.format(formatter));
    }
}
