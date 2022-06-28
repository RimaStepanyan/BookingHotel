package classwork.lesson18;

public class ExceptionTest {

    public static void main(String[] args) {
        String number = "654q";
        try {
            int a = Integer.parseInt(number);
            System.out.println(a * 2);
        } catch (NumberFormatException e) {
            System.out.println("Please input only numbers");
        }
        System.out.println("Hello");
        System.out.println("Java");
    }
}
