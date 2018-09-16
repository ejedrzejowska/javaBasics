package wrapup.repetition.collections;

import java.util.*;

public class Utils {

    public static Set<Integer> createSet(int size){
        Set<Integer> collection = new TreeSet<>();
        for (int i = 0; i < size; i++){
            collection.add(new Random().nextInt(1000));
        }
        return collection;
    }

    public static Collection<Integer> createCollection(int size){
        Collection<Integer> collection = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            collection.add(new Random().nextInt(1000));
        }
        return collection;
    }



    public static void printCollection(Collection<Integer> collection){
        System.out.println("Start");
        collection.forEach(o -> {
            System.out.print(o);
            System.out.print(", ");
        });
        System.out.println();
        System.out.println("Koniec");
    }

}
