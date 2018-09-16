package wrapup.repetition.collections;


public class Animal implements Comparable<Animal> {
    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Animal(Animal a) {
        this.name = a.name;
        this.type = a.type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Animal o) {
        if (o == null) {
            throw new IllegalArgumentException();
        }
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
