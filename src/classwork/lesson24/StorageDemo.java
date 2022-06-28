package classwork.lesson24;

import classwork.lesson22.fileExample.ioExample.serialization.file.Student;

public class StorageDemo {

    public static void main(String[] args) {
        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(7);

        Storage<String> strStorage = new Storage<>();
        strStorage.add("8");

        Storage<Student> studentStorage = new Storage<>();

        studentStorage.add(new Student());

        Student student = studentStorage.getByIndex(0);


    }
}
