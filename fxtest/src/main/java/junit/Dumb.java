package junit;

import java.util.stream.Stream;

public class Dumb {
    public int getSum(Integer... numbers) {
        return Stream.of(numbers)
                .mapToInt(i -> i)
                .sum();
    }

    public int[] getNumbers() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public int specialAdd(int left, int right) {
        return left + right + 2;
    }
}
