package javaBasic2.generic;

public class Book<T> {

    private T title;

    public T getTitle() {
        return title;
    }

    public void setTitle(T title) {
        this.title = title;
    }

    public void printTitle(){
        if(title instanceof String){
            String s = (String) title;
            System.out.println("Tytuł książki: " + s);
//            System.out.println("Tytuł książki: " + title);
        }
        if(title instanceof Cover){
            Cover c = (Cover) title;
            c.printSth();
        }
    }
}
