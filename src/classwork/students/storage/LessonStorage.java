package classwork.students.storage;

import classwork.students.exception.LessonNotFoundException;
import classwork.students.model.Lesson;

public class LessonStorage {

    private Lesson[] array = new Lesson[10];
    private int size = 0;

    public void add(Lesson lesson) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = lesson;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    private void increaseArray() {
        Lesson[] temp = new Lesson[array.length + 10];
        System.arraycopy(array,0, temp, 0, array.length);
        array = temp;
    }

    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index");
        } else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public int getSize() {
        return size;
    }

    public Lesson getLessonByIndex(int index) throws LessonNotFoundException {
        if (index < 0 || index >= size) {
            throw new LessonNotFoundException("Lesson with " + index + " does not exists");

        }
        return array[index];
    }
}