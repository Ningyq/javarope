package java4;

public class Duot extends DuoTai {
    int in = 789;

    public void batt() {
        System.out.println("9876543210");
    }

    public int getIn() {
        return this.in;
    }

    public int getIn1() {
        return super.in;
    }

    public static void main(String[] args) {
        Duot duot = new Duot();
        System.out.println(duot.getIn());
        System.out.println(duot.getIn1());
        duot.getIn1();
//        DuoTai duoTai =new DuoTai();
//        duoTai.batt();
//        System.out.println(duoTai.hp);
//        System.out.println(duoTai.name);
    }
}
