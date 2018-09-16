package wrapup.repetition.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MainMaps {
    //    Map<String, String> myMap = new HashMap<>();
//    Map<String, String> myMap = new TreeMap<>();
    Map<String, String> myMap = new LinkedHashMap<>();

    public void createMap(int size) {
        for (int i = 0; i < size; i++) {
            myMap.put("klucz: " + i, "wartosc: " + i);
        }
    }

    public void testMap() {
        createMap(20);
        Set<String> keys = myMap.keySet();
        System.out.println();
        for (String str : keys) {
            System.out.println(str + " " + myMap.get(str));
        }
    }

    public void testMap2(){
        createMap(20);
        for (Map.Entry<String, String> entry : myMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
            System.out.println(entry);
        }
    }

    public void sample() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Funkcja 1");
        map.put(2, "Funkcja 2");
        map.put(3, "Funkcja 3");
        map.put(4, "Funkcja 4");
        map.put(5, "Funkcja 5");
        System.out.println(map.get(1));
    }

    public static void main(String[] args) {
        new MainMaps().testMap2();
    }
}
