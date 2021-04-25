package ass1;

public class MyArrayList<T>{
    private  Object[] array;
    private int size = 0;
    private int capacity = 5;

    public MyArrayList() {
        array = new Object[capacity];
    }

    public T get(int index){
        return (T) array[index];
    }

    public void add(T newItem, int index) {
        if (index == capacity){
            increaseBuffer();
        }
        array[index] = newItem;
        size++;
    }

    public int find(T keyItem){

        for (int i = 0; i < size; i++){
            if(keyItem.equals(array[i])){
                return i;
            }
        }
        return -1;
    }
    public T remove(int index){
        T t = (T) array[index];
        for (int i = index; i < size - 1; i++)
            array[i] = array[i + 1];
        size--;
        return t;
    }
    public void reverse(){
        for (int i = size-1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }

    private void increaseBuffer(){
        capacity = (int) (1.5 * capacity);
        Object[] array2 = new Object[capacity];
        for (int i = 0; i < size; i++) {
            array2[i] = array[i];
        }
        array = array2;
    }


    public int getSize() {
        return size;
    }
}