package java4;

public class TestException {

    public static void main(String[] args) {

        try{
            System.out.println(-1.0/0);
            System.out.println(1.0/0);
            System.out.println(-1/0);
            System.out.println(1/0);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("输出结束！");
    }
}
