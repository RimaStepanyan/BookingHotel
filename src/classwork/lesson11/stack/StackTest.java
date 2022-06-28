package classwork.lesson11.stack;

public class StackTest {
    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.push(5);
        myStack.push(4);
        myStack.push(9);


      //  myStack.array = new int[20];

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        myStack.push(8);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
