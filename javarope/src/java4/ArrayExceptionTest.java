package java4;

import java.util.Arrays;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] array = new int[4];
        Arrays.fill(array,5);

        for (int i = 0 ; i < 6 ; i ++ ){
            System.out.print(array[i] + "  ");
        }

//        try {
//            for (int i = 0 ; i < 6 ; i ++ ){
//                System.out.print(array[i] + "  ");
//            }
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        System.out.println("1233");
    }
}
