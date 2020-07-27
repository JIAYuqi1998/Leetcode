import java.util.LinkedList;
import java.util.Queue;

public class No933 {
    Queue<Integer> queue;
    public No933() {
        queue = new LinkedList<Integer>();
    }
    public int ping(int t) {
        queue.add(t);
        while (t - queue.peek() > 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
