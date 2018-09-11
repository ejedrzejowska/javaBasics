package javaBasics.excercise;

import bookStore.model.Author;
import bookStore.model.Book;

import java.io.*;
import java.util.UUID;

public class Util<T> {

    private void saveObj(T object) {

        try(FileOutputStream fs = new FileOutputStream("books.bin")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(object);

            os.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Input/Output exception");
        }

    }

    private T readObj(){
        T object = null;
        try(FileInputStream fi = new FileInputStream("books.bin")) {

            ObjectInputStream os = new ObjectInputStream(fi);

            object = (T)os.readObject();

            os.close();
            System.out.println(object.toString());

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Cannot read file");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found");
        }
        return object;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Book someBook = new Book("Tytuł", new Author("Nazwisko", "Imię", UUID.randomUUID()),
                "kod ISBN", 24.15d, 4);

        Util util = new Util();
        util.saveObj(someBook);
        System.out.println(util.readObj());

    }
}