package bookStore.dao;

import bookStore.model.Author;

import java.util.UUID;

public class MainDao {

    public static void main(String[] args) {
        BookDao bd = new BookDao();
        Author author = new Author("Milne", "A. A.", UUID.randomUUID());

        System.out.println(bd.getSortedList(SortBook.QUANTITY));
        System.out.println(bd.getBook("Chatka"));
        System.out.println(bd.getTitles(author));

    }
}
