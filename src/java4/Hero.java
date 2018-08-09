package java4;

public class Hero {
    public String name;
    protected float hp;

    public boolean equals(Object o){
        if(o instanceof Hero){
            Hero h = (Hero) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero h1= new Hero();
        h1.hp = 300;
        Hero h2= new Hero();
        h2.hp = 400;
        Hero h3= new Hero();
        h3.hp = 300;

        System.out.println(h1==h2);
        System.out.println(h1==h3);

    }
}