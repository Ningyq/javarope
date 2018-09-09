package java4;

import java.util.Arrays;

public class MyTest {
    public static class myException extends Exception {
        public myException() {
        }

        public myException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws Exception {
        int[] array = new int[5];
        Arrays.fill(array,8);
        for (int i = 4 ; i >= 0 ;i--){
            if (i == 0){
                throw new myException("除零异常！");
            }
            System.out.println("array["+i+"]/"+i+"="+array[i]/i);
        }
    }
}
