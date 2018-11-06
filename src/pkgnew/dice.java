package pkgnew;

import java.util.Random;

public class dice {
    private final Random random = new Random();

    public int roll(int max) {
        return 1 + random.nextInt(max);
    }

    public int roll6() {
        return roll(6);
    }

    public int roll10() {
    return roll(10);
    }

    public int roll20() {
    return roll(20);
    }
}