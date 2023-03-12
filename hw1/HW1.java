package seminar4.hw1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        Deque<Integer> ll = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            ll.add(i);
        }
        System.out.println(ll);
        while (ll.size()>0){
            System.out.print(ll.pollLast()+" ");
        }
    }
}
