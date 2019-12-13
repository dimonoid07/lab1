package Book;

import Book.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Как стать миллионером", "Конев Дмитрий Игоревич", 96, "Бизнес");
        Book b2 = new Book("Как стать нищим", "Булин Александр Александрович", 180, "Биография");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}