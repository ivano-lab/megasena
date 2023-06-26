import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random(60);

        for (int i = 0; i < 6; i++) {
            int number = generate.nextInt();
            System.out.println(number);
        }

    }
}
