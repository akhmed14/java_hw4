package seminar4.hw2;

import java.util.Stack;

public class hw2 {
    public static void main(String[] args) {
        String text = "(({}))";
        System.out.println(isValid(text));
    }
    public static boolean isValid(String txt) {
        Stack<Character> stack = new Stack<>();
        for (char a : txt.toCharArray()) {
            if (a == '(')
                stack.push(')');
            else if (a == '{')
                stack.push('}');
            else if (a == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != a)
                return false;
        }
        return stack.isEmpty();
    }
}

