package homework.books.storage;


import homework.books.model.Book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;

    public void add(Book value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + "." + array[i]);
        }
    }


    public void printBookByGenre(String genreName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genreName)) {
                System.out.println(array[i]);
            }
        }
    }


    public void printBooksByAuthorName(String authorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].getAuthorName().equals(authorName)) {
                System.out.println(array[i]);
            }
        }
    }


    public void printBooksByPriceRange(int first, int last) {
        for (int i = 0; i < size; i++) {
            if (array[i].getPrice() >= first && array[i].getPrice() <= last) {
                System.out.println(array[i]);
            }


        }

    }


}


