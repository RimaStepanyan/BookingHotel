package homework.dynamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
       DynamicArray dynArray = new DynamicArray();
    dynArray.add(4);
    dynArray.add(5);
    dynArray.add(6);
    dynArray.add(61);
    dynArray.add(70);
    dynArray.add(16);
    dynArray.add(41);
    dynArray.add(65);
    dynArray.add(42);
        System.out.println(dynArray.getByIndex(2));
        System.out.println(dynArray.getFirstIndexByValue(4));
        dynArray.print();
        System.out.println();
        dynArray.add(5,13);
        dynArray.print();


    }
}
