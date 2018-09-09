package pattern;

class BlockSingleton {
    private static BlockSingleton instance;

    private BlockSingleton(){}

    static {
        try {
            instance = new BlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("exception occurred ");
        }
    }
}

public class StaticBlockSingleton {
}
