package java1;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCard {

    public static void main(String[] args) {
        List<Double> ints = new ArrayList();
        for (int i = 1; i <= 100; i++){
            Double temp = new Double(i + "."+ i);
            System.out.println(i + "."+ i);
            ints.add(temp);
        }
        double sum = sum(ints);
        System.out.println("Sum is:"+sum);
    }

    public static double sum(List<? extends Number> list) {
        double sum = 0;
        for (Number n: list) {
            sum  += n.doubleValue();
        }
        return sum;
    }
}
