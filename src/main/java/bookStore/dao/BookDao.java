package bookStore.dao;

import bookStore.model.Author;
import bookStore.model.Book;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Book> getSortedList(String parameter){
        List<Book> tempList = new ArrayList<>(bookList);
        if(parameter.equals("title")){
            tempList.sort((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        } else if(parameter.equals("price")){
            tempList.sort((o1, o2) -> (int)(o1.getPrice() - o2.getPrice()));
        } else if(parameter.equals("quantity")){
            tempList.sort((o1, o2) -> o1.getQuantity() - o2.getQuantity());
        } else {
            tempList.sort((o1, o2) -> o1.getAuthor().getLastName().compareTo(o2.getAuthor().getLastName()));
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
