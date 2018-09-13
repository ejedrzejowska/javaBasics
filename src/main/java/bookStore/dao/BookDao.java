package bookStore.dao;

import bookStore.model.Author;
import bookStore.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookDao {
    private List<Book> bookList = new ArrayList<>();

    public BookDao() {
        bookList.add(new Book("Kubuś Puchatek", new Author("Milne", "A. A.", UUID.randomUUID()), "isbn", 12.50, 20));
        bookList.add(new Book("Chatka Puchatka", new Author("Milne", "A. A.", UUID.randomUUID()), "isbn", 12.50, 20));
        bookList.add(new Book("101 dalmatyńczyków", new Author("Smith", "Doddie", UUID.randomUUID()), "isbn", 24, 13));
        bookList.add(new Book("Szatan z 7 klasy", new Author("Makuszyński", "Kornel", UUID.randomUUID()), "isbn", 21.30, 5));
        bookList.add(new Book("Cudowna podróż", new Author("Lagerlof", "Selma", UUID.randomUUID()), "isbn", 34, 3));
    }

    public List<Book> getSortedList(SortBook parameter){ // w switchu
        List<Book> tempList = new ArrayList<>(bookList);
        switch (parameter){
            case TITLE:
                tempList.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
                break;
            case PRICE:
                tempList.sort((b1, b2) -> (int)(b1.getPrice() - b2.getPrice()));
                break;
            case QUANTITY:
                tempList.sort((b1, b2) -> b1.getQuantity() - b2.getQuantity());
                break;
            case AUTHOR:
                tempList.sort((b1, b2) -> b1.getAuthor().getLastName().compareTo(b2.getAuthor().getLastName()));
                break;
             default:
                 System.out.println("No matching data, czy coś");
        }
        return tempList;
    }

    public List<Book> getTitles(Author author) {
        List<Book> tempList = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getAuthor().getLastName().equals(author.getLastName())) {
                tempList.add(book);
            }
        }
        return tempList;
    }

    public Book getBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().contains(title)) {
                return book;
            }
        }
        return new Book();
    }
}
