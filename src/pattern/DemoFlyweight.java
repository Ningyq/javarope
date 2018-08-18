package pattern;

class Gazillion {
    private static int num = 0;
    private int row;

    Gazillion(int row) {
        this.row = row;
    }

    void print(int col) {
        System.out.print(" " + row + col);
    }

}

class FlyWeightFactory {
    private Gazillion[] pool;

    public FlyWeightFactory(int maxRows) {
        this.pool = new Gazillion[maxRows];
    }

    public Gazillion getFlyWeight(int row) {
        if (this.pool[row] == null) {
            pool[row] = new Gazillion(row);
        }
        return pool[row];
    }
}

public class DemoFlyweight {
    private static final int ROWS = 5, COLS = 10;

    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory(ROWS);
        for (int i = 0; i < ROWS; i++){
            for (int j = 0; j < COLS; j++) {
                factory.getFlyWeight(i).print(j);
            }
            System.out.println();
        }
    }
}
