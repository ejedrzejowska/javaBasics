package wrapup.repetition.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainAnimalCollection {
    private List<Animal> animalList = new ArrayList<>();

    public MainAnimalCollection() {
        animalList.add(new Animal("żyrafa", "ssak"));
        animalList.add(new Animal("łoś", "ssak"));
        animalList.add(new Animal("żubr", "ssak"));
        animalList.add(new Animal("antylopa", "ssak"));
        animalList.add(new Animal("tygrys", "ssak"));
        animalList.add(new Animal("jaskółka", "ptak"));
        animalList.add(new Animal("okoń", "ryba"));
        animalList.add(new Animal("ślimak", "ryba"));
    }

    public void sampleTest(){
        System.out.println(animalList);
        List<Animal> copy = new ArrayList<>(animalList);
//        List<Animal> copy = new ArrayList<>();
//        Collections.copy(animalList, copy);
        Collections.sort(copy);
        System.out.println(animalList);
        System.out.println(copy);
        Animal animal = copy.get(1);
        animal.setName("krowa");
        System.out.println(animalList);
        System.out.println(copy);

        List<Animal> copy2 = makeCopy(animalList);
        Animal anima2 = copy.get(1);
        anima2.setName("jakiestam");
        System.out.println(animalList);
        System.out.println(copy2);

    }

    private List<Animal> makeCopy(List<Animal> list){
        List<Animal> copy = new ArrayList<>();
        for(Animal animal : list){
            copy.add(new Animal(animal));
        }
        return copy;
    }

    public static void main(String[] args) {
        new MainAnimalCollection().sampleTest();
//        Animal animal1 = new Animal("sowa", "ptak");
//        Animal animal2 = animal1;
//        animal2.setName("krowa");
//        System.out.println(animal1);
//        System.out.println(animal2);
//        Animal animal3 = new Animal("ślimak", "pseudoryba");
//        Animal animal4 = new Animal(animal3);
//        animal4.setType("ryba");
//        System.out.println(animal3);
//        System.out.println(animal4);

    }
}
