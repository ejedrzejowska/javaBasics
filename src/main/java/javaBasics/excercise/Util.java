package javaBasics.excercise;

import bookStore.model.Author;
import bookStore.model.Book;

import java.io.*;
import java.util.UUID;

public class Util<T> {
    private static final String FILE_PATH = "books.bin";

    private void saveObj(T object) {

        try(FileOutputStream fs = new FileOutputStream(FILE_PATH)) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(object);
            //os.close();   // już nie potrzebne
//        } catch (FileNotFoundException ex) {
//            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Input/Output exception");
        }

    }

    private T readObj(){
        File file = new File(FILE_PATH);
        T object = null;
        if(file.exists()) {
            try (FileInputStream fi = new FileInputStream(FILE_PATH)) {
                ObjectInputStream os = new ObjectInputStream(fi);
                object = (T) os.readObject();
                os.close();
            } catch (FileNotFoundException ex) {        ///mozna (Exception ex)...
                System.out.println("File not found");
            } catch (IOException ex) {
                System.out.println("Cannot read file");
            } catch (ClassNotFoundException ex) {
                System.out.println("Class not found");
            }
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