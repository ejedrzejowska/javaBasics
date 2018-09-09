package bookStore.utils;

public class MainList<T> {
    private Object[] table = new Object[0];

    public void add(T item) {
        increaseSize();
        table[table.length - 1] = item;
    }

    private void increaseSize() {
        Object[] temp = new Object[table.length + 1];
        for (int i = 0; i < table.length; i++) {
            temp[i] = table[i];
        }
        table = temp;
    }

    public void removeItem(int index){
        Object[] temp = new Object[table.length - 1];
        int j = 0;
        if(index < table.length){
            for(int i = 0; i < table.length - 1; i++){
                if(i == index){
                    j++;
                }
                temp[i] = table[i +j];
            }
        } else {
            throw new IndexOutOfBoundsException("Index spoza tabeli");
        }
    }

    public T getItem(int index) {
        return (T) table[index];
    }

    public T[] getTable() {
        return (T[]) table;
    }
}
