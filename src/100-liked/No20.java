import java.util.*;
public class No20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '['|| s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char item = stack.pop();
                if (item == '(' && s.charAt(i) != ')') {
                    return false;
                }
                if (item == '{' && s.charAt(i) != '}') {
                    return false;
                }
                if (item == '[' && s.charAt(i) != ']') {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}

