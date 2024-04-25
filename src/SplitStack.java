import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class SplitStack {

    public static Stack<Integer> splitStack(Stack<Integer> stack) {
        Stack<Integer> result = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();


        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0)
                queue.add(num);
            else
                result.push(num);
        }

        // Move negatives back to stack
        while (!queue.isEmpty()) {
            result.push(queue.remove());
        }

        return result;
    }
}
