import java.util.Random;

public class randomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        double x = random.nextDouble(24);

        System.out.println(x);
    }
}
