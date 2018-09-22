import java.util.Scanner;

public class PrimeNumber {

    boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 1;

        PrimeNumber prime = new PrimeNumber();

        Scanner sc = new Scanner(System.in);
        System.out.print("输入你要生成的素数个数：");
        int count = sc.nextInt();

        while (true) {
            if (prime.isPrimeNumber(num)) {
                System.out.println(num);
                count --;
            }
            if (count == 0) {
                return;
            }
            num += 1;
        }
    }
}
