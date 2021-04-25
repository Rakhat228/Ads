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
        MyLinkedList<String> linklist = new MyLinkedList<>();
        linklist.add("Travis", 0);
        linklist.add("Uzi", 1);
        linklist.add("Post", 2);
        linklist.add("Peep", 3);
        linklist.add("Boomin", 4);
        for(int i = 0; i < linklist.getSize(); i++){
            System.out.print(linklist.get(i) + " -> ");
        }

        Scanner qwe = new Scanner(System.in);
        System.out.println("Find: ");
        String astro = qwe.next();
        System.out.println(linklist.find(astro));

        System.out.println("Remove(index): ");
        int bamb2 = qwe.nextInt();
        System.out.println(linklist.remove(bamb2));

        System.out.print("LinkList now: ");
        for (int i = 0; i < linklist.getSize(); i++){
            System.out.print(linklist.get(i) + " -> ");
        }
        System.out.println(" ");
        System.out.print("Reverse: ");
        linklist.reverse();
    }
    public class MyLinkedList<T> {
        private MyNode<T> head;
        private MyNode<T> tail;
        private int size;

        public MyLinkedList(){
            head = null;
            size = 0;
        }

        public void add(T newItem, int index){
            MyNode<T> newNode = new MyNode<>(newItem);
            if (head == null && index == 0) {
                head = tail = newNode;
            } else{
                MyNode current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                MyNode n = new MyNode(newItem, current.next);
                current.next = n;
            }
            size++;
        }

        public int find(T keyItem){
            for (int i = 0; i < size; i++){
                MyNode current = head;
                for (int j = 0; j < i; j++) {
                    current = current.next;
                }
                if(keyItem.equals(current.data)){
                    return i;
                }
            }
            return -1;
        }

        public T remove(int index) {
            T a;
            if (index == 0) {
                a = head.data;
                head = head.next;
            } else {
                MyNode<T> current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
                a = current.next.data;
                current.next = current.next.next;
            }
            size--;
            return a;
        }

        public void reverse(){
            for (int i = size - 1; i >= 0; i--){
                MyNode current = head;
                for (int j = 0; j < i; j++) {
                    current = current.next;
                }
                System.out.print(current.data + " -> ");
            }
        }

        public T get(int index){
            MyNode<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        private static class MyNode<E> {
            E data;
            MyNode<E> next;
            MyNode<E> prev;
            MyNode(E data) {
                this.data = data;
            }
            MyNode(E data, MyNode next) {
                this.data = data;
                this.next = next;
            }
        }

        public int getSize() {
            return size;
        }
    }
}

