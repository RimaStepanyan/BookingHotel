package classwork.lesson17;

public class Demo {
    public static void main(String[] args) {

        A a = new A();

        B b = new B();

       printKuKu5times(a);
        
    }
    
    static void printKuKu5times(ShowKuKu o){
        for (int i = 0; i < 5; i++) {
            o.printKuKu();
        }
    }
}
