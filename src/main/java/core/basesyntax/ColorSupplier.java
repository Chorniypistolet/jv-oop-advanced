package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();

    public static String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}
