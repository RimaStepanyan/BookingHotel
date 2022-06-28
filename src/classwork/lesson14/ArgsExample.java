package classwork.lesson14;

public class ArgsExample {

    public static void main(String[] args) {
        System.out.println("args length = " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
