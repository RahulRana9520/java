public class StaticUse {
    static int x;
    int y;
    void set(int y){
        this.y=y;
    }
    void show(){
        System.out.println(x+" "+y);
    }

    public static void main(String[] args) {
        StaticUse d1 = new StaticUse();
        d1.set(5);
        d1.show();       //0 5

        StaticUse.x=15;
        d1.show();       // 15 5

        StaticUse d2 = new StaticUse();
        d2.show();      //15 0
    }
}
