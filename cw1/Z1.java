package seminar4.cw1;

import java.util.Arrays;
import java.util.LinkedList;

public class Z1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        int sum = 0;
        for (int i = 0; i < ll.size(); i++) {
            if(ll.get(i) % 2 == 0) sum+= ll.get(i);
        }
        System.out.println(sum);
    }
}
