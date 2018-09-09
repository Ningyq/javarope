package java3;

import java.util.Random;
import java.util.Scanner;

public class NumStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < times ; i++){
            int num = random.nextInt((int) Math.pow(10,10));
            String  lnum = "" + num;
            while (lnum.length() != times){
                if (lnum.length() < times){
                    lnum = "0"+lnum;
                }else {
                    lnum = lnum.substring(0,times);
                }
            }
            sb.append(lnum+"\n");
        }
        System.out.print(sb);
    }
}
