/**Class: SplitStack
 * @author Tyler Robinson
 * @version 1.2
 * Course: ITEC 2140 Spring 2023
 * Written: April 25, 2024
 */



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
