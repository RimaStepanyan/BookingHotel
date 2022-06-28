package classwork.lesson25;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(111, "poxos");
        names.put(222, "petros");

        String value = names.get(444);
        Collection<String> values = names.values();
        for (String s : values) {
            System.out.println(s);
        }
        Set<Integer> integers = names.keySet();
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(value);

        Set<Map.Entry<Integer, String>> entries = names.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
