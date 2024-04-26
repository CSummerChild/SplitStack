/**Class: Main
 * @author Tyler Robinson
 * @version 1.7
 * Course: ITEC 2140 Spring 2023
 * Written: April 25, 2024
 */



import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Example 1
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(-5);
        stack1.push(67);
        stack1.push(-45);
        stack1.push(67);
        stack1.push(9);
        stack1.push(0);
        stack1.push(-42);
        stack1.push(56);
        stack1.push(-7);
        Stack<Integer> result1 = SplitStack.splitStack(stack1);
        while (!result1.isEmpty()) {
            System.out.print(result1.pop() + " ");
        }
        System.out.println();

        // Example 2
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(-2);
        stack2.push(-3);
        stack2.push(4);
        stack2.push(-5);
        stack2.push(6);
        stack2.push(-7);
        stack2.push(8);
        stack2.push(9);
        Stack<Integer> result2 = SplitStack.splitStack(stack2);
        while (!result2.isEmpty()) {
            System.out.print(result2.pop() + " ");
        }
        System.out.println();
    }
}
