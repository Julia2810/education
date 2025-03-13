import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(getArithmeticProgressionSum(a, b));


        System.out.println(getArithmeticProgressionSum(10000000, 1000000000));
    }



    public static long getArithmeticProgressionSum(int a, int b) {
        return LongStream.rangeClosed(a, b - 1).sum();


    }
}
