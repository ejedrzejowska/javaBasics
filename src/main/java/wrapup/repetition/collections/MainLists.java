package wrapup.repetition.collections;

import java.util.*;

public class MainLists {
    private List<Integer> collection = new ArrayList<>(createList(10000000));

    private void checkTime(List<Integer> list){
        long start = System.currentTimeMillis();
        list.add(54);
        long stop = System.currentTimeMillis();
        System.out.println("Roznica miedzy start a stop " + (stop - start));
        long start1 = System.currentTimeMillis();
        list.add(0, 54);
        long stop1 = System.currentTimeMillis();
        System.out.println("Roznica miedzy start a stop index[0]: " + (stop1 - start1));
        long start2 = System.currentTimeMillis();
        int a = list.get(500000);
        System.out.println(a);
        long stop2 = System.currentTimeMillis();
        System.out.println("Wyszukiwanie " + (stop2 - start2));
        long start3 = System.currentTimeMillis();
        list.add(5000, 158);
        long stop3 = System.currentTimeMillis();
        System.out.println("Roznica miedzy start a stop index[5000]: " + (stop3 - start3));
        long start4 = System.currentTimeMillis();
        Collections.sort(list);
        long stop4 = System.currentTimeMillis();
        System.out.println("sortowanie: " + (stop4 - start4));
    }

    public void sampleArrayList(){
        List<Integer> temp = new ArrayList<>(collection);
        checkTime(temp);
    }

    private List<Integer> createList(int size){
        List<Integer> collection = new ArrayList<>();
        for (int i = 0; i < size; i++){
            int a = new Random().nextInt(1000);
            collection.add(a);
        }
        return collection;
    }

    public void sampleLinkedList(){
        List<Integer> temp = new LinkedList<>(collection);
        checkTime(temp);
    }

    public void sampleVector(){ //nie uzywany
        List<Integer> temp = new Vector<>(collection);
        checkTime(temp);
    }
    public void sampleTest(){
        System.out.println("Array List");
        sampleArrayList();
        System.out.println("Linked List");
        sampleLinkedList();
        System.out.println("Vector");
        sampleVector();
    }

    public static void main(String[] args) {
        new MainLists().sampleTest();
    }

}
