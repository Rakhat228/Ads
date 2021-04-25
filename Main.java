package ass1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        //MyArrayList
        MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(5, 0);
        list.add(6, 1);
        list.add(7, 2);
        list.add(1, 3);
        list.add(9, 4);
        for (int i = 0; i < list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find: ");
        int ac = scanner.nextInt();
        System.out.println(list.find(ac));
        System.out.println("Remove(index): ");
        int big = scanner.nextInt();
        System.out.println(list.remove(big));
        System.out.print("Array now: ");
        for (int i = 0; i < list.getSize(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(" ");
        System.out.print("Reverse: ");
        list.reverse();
        System.out.println("-------------------------------------------------------");



        //MyLinkedList
        System.out.println("------------------------------------------");

        MyLinkedList<String> linklist = new MyLinkedList<>();
        linklist.add("Post", 0);
        linklist.add("Snoopy", 1);
        linklist.add("Peep", 2);
        linklist.add("Uzi", 3);
        linklist.add("Pump", 4);
        for(int i = 0; i < linklist.getSize(); i++){
            System.out.print(linklist.get(i) + " -> ");
        }

        Scanner asd = new Scanner(System.in);
        System.out.println("Find: ");
        String astro = asd.next();
        System.out.println(linklist.find(astro));

        System.out.println("Remove(index): ");
        int bamba = asd.nextInt();
        System.out.println(linklist.remove(bamba));

        System.out.print("LinkList now: ");
        for (int i = 0; i < linklist.getSize(); i++){
            System.out.print(linklist.get(i) + " -> ");
        }
        System.out.println(" ");
        System.out.print("Reverse: ");
        linklist.reverse();
    }
}