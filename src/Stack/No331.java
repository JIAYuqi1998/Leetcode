import java.sql.Array;
import java.util.Arrays;
import java.util.Stack;

public class No331 {
    public boolean isValidSerialization(String preorder) {
        String[] strs = preorder.split(",");
        int edges = 1;
        for (String i : strs) {
            edges--;
            if (edges < 0) {return false;}
            if (!i.equals("#")) {
                edges += 2;
            }
        }
        return edges == 0;

//        if (preorder.equals("#")) {return true;}
//        if (preorder.length() < 3) {return false;}
//        Stack<String> s = new Stack<>();
//        String[] strs = preorder.split(",");
//
//        for (int i = 0; i < strs.length; i++) {
//            String c = strs[i];
//            while (!s.isEmpty() && s.peek().equals("#") && c.equals("#")) {
//                s.pop();
//                if (s.isEmpty()) {
//                    return false;
//                }
//                s.pop();
//            }
//            s.push(c);
//        }
//        return s.size() == 1 && s.peek().equals("#");
    }
}
