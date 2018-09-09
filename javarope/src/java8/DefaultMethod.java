package java8;

interface IFormula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(positive(a));
    }

    static int positive(int a) {
        return a > 0 ? a : 0;
    }

    default void log(Number result) {
        System.out.println(result);
    }
}

class Formula implements IFormula {
    @Override
    public double calculate(int a) {
        double result = sqrt((int) sqrt(a));
        log(result);
        return result;
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        IFormula formula = new IFormula() {
            @Override
            public double calculate(int a) {
                double result = sqrt((int) sqrt(a));
                log(result);
                return result;
            }
        };
        formula.calculate(100);
        formula.log(123.45);
        formula.log(IFormula.positive(-10));

        IFormula formula2 = new Formula();
        formula2.calculate(100);
        formula2.log(123.45);
        formula2.log(IFormula.positive(-10));

        IFormula formula3 = Math::incrementExact;
        formula3.log(formula3.calculate(10));
    }
}
