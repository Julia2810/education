import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15) + 1;
        }

        System.out.println(Arrays.toString(array));

        Map<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
            }
        }
    }
}


