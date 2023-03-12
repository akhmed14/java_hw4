package seminar4.cw1;

import java.util.LinkedList;
import java.util.Scanner;

public class Baza {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ll.add(i);
            scanner.close();
        }
        //показать/достать элемент
        System.out.println(ll.peek());
        System.out.println("peek: "+ll);
        System.out.println(ll.pop());
        System.out.println("pop: "+ll);
        //добавление в начало/в конец
        ll.addFirst(3);
        System.out.println("first: "+ll);
        ll.addLast(4);
        System.out.println("Last: "+ll);
        ll.add(5);
        System.out.println("add: "+ll); // не отличается от Last
        //замены
        ll.set(0,7);
        System.out.println("set: "+ll);
        //наличие элемента
        ll.contains(7);
        System.out.println("contains: "+ll);
        // удаление
        ll.remove(4);
        System.out.println("remove: "+ll);
    }
}
