package homework.books;

import homework.books.command.Commands;
import homework.books.model.Book;
import homework.books.storage.BookStorage;

import java.util.Scanner;


public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    public static void main(String[] args) {

        bookStorage.add(new Book("Հմայված հոգին", "Ռոմեն Ռոլան", 1000, 123, "Ռոմանս"));
        bookStorage.add(new Book("Հանճարը", "Թեոդոր Դրայզեր", 2000, 365, "Ռոմանս"));
        bookStorage.add(new Book("Պատվար", "Թեոդոր Դրայզեր", 3000, 852, "Ռեալիզմ"));

        boolean run = true;
        while (run) {
            System.out.println("Please input " + EXIT + " for exit");
            System.out.println("Please input " + ADD_BOOK + " for add book");
            System.out.println("Please input " + PRINT_ALL_BOOKS + " for print all books");
            System.out.println("Please input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by authorName");
            System.out.println("Please input " + PRINT_BOOKS_BY_GENRE + " for print books by genre");
            System.out.println("Please input " + PRINT_BOOKS_BY_PRICE_RANGE + " for print print books by priceRange");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                case PRINT_ALL_BOOKS:
                    bookStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHORNAME:
                    printBooksByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("Invalid command!!!");
            }


        }
    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input price range");
        int first = scanner.nextInt();
        int last = scanner.nextInt();
        bookStorage.printBooksByPriceRange(first,last);
    }

    private static void printBooksByGenre() {
        System.out.println("Please input genre");
        String genreName = scanner.nextLine();
        bookStorage.printBookByGenre(genreName);

    }

    private static void printBooksByAuthorName() {
        System.out.println("Please input Author Name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName);

    }


    private static void addBook() {
        System.out.println("Please input title");
        String title = scanner.nextLine();
        System.out.println("Please input author Name");
        String authorName = scanner.nextLine();
        System.out.println("Please input price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
    }

}
