package classwork.lesson13;

public class FinalDemo {
    public static void main(String[] args) {
//        final int a = 20;
//        System.out.println(a);
//        a = 60;
//        System.out.println(a);
        Box mybox = new Box(3,4,5);
        mybox.width = 6;
        System.out.println(mybox.width);
        System.out.println(Box.WARRANTY_YEAR);
    }
}
