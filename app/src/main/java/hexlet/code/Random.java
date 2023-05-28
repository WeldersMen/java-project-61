package hexlet.code;

public class Random {
    private static final int RANDOM = 101;

    public static int randomNumber() {
        return (int) (Math.random() * RANDOM);
    }
}
