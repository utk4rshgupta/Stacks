import java.util.LinkedList;
import java.util.Queue;

public class StackUSingQueue {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();
    public void push(int x) {
        queue2.add(x);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.remove();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
    public static void main(String[] args) {
        StackUSingQueue obj = new StackUSingQueue();

        obj.push(1);   // push
        obj.push(2);   // push

        System.out.println(obj.top());   // top → 2
        System.out.println(obj.pop());   // pop → 2
        System.out.println(obj.empty()); // empty → false
    }

}
