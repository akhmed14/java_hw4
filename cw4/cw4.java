package seminar4.cw4;

import java.util.Deque;
import java.util.LinkedList;

public class cw4 {
    public static void main(String[] args) {
        String text = "/home//foo";
        System.out.println(simplifypath(text));
    }

    public static String simplifypath(String path) {
        Deque<String> list = new LinkedList<>();
        String[] arr = path.split("/");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("") || arr[i].equals(".")) continue;
            else if (arr[i].equals("..")) {
                if (!list.isEmpty()) list.pop();
            }
            else list.add(arr[i]);
        }
        return "/" + String.join("/", list);
    }
}
