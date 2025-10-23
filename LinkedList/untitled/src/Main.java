import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer i : list1) {
            System.out.println(i);
        }
        System.out.println();

        list1.clear();
        list2.clear();
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer i : list1) {
            System.out.println(i);
        }
        System.out.println();


        list1.clear();
        list2.clear();
        list2.add(0);
        list1.addAll(list2);
        Collections.sort(list1);
        for (Integer i : list1) {
            System.out.println(i);
        }
    }
}