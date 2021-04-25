package com.company;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

}
    public Main(){
    MyArrayList<Integer> list = new MyArrayList<Integer>();
    list.add(5, 0);
    list.add(6, 1);
    list.add(7, 2);
    list.add(1, 3);
    list.add(9, 4);
    for (int i = 0; i < list.getSize(); i++) {
        System.out.print(list.get(i) + " ");
    }
    Scanner scanner = new Scanner(System.in);
    System.out.println("Find: ");
    int asto = scanner.nextInt();
    System.out.println(list.find(asto));
    System.out.println("Remove(index): ");
    int bamba = scanner.nextInt();
    System.out.println(list.remove(bamba));
    System.out.print("Array now: ");
    for (int i = 0; i < list.getSize(); i++) {
        System.out.print(list.get(i) + " ");
    }
    System.out.println(" ");
    System.out.print("Reverse: ");
    list.reverse();
}
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
}
