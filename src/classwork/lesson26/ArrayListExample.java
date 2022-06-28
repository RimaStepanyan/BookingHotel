package classwork.lesson26;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        System.out.println("size:" + users.size());
        System.out.println(users);

        User poxos = new User("Poxos", "poxosyan", "poxos@mail.com", "poxospoxos");
        users.add(poxos);
        users.add(poxos);
        users.add(poxos);
        users.add(poxos);
        users.add(poxos);
        users.add(poxos);
        users.add(poxos);
        users.add(poxos);

        System.out.println("size:" + users.size());
        System.out.println(users);

        User petros = new User("Petros", "Petrosyan", "poxos@mail.com", "poxospoxos");
        users.set(3, petros);
        System.out.println("size:" + users.size());
        System.out.println(users);

        boolean contains = users.contains(petros);
        System.out.println(contains);

        System.out.println("remove:" + users.remove(new User("Petros", "Petrosyan", "poxos@mail.com", "poxospoxos")));
        System.out.println("size:" + users.size());
        System.out.println(users);
        if (users!=null && users.isEmpty()){

        }


    }

}
