import java.util.Stack;

class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    // Push element x to the back of the queue
    public void push(int x) {
        // Push to st1 directly
        st1.push(x);
    }
    
    // Remove the front element of the queue
    public int pop() {
        // Transfer elements from st1 to st2 if st2 is empty
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        // Pop from st2
        return st2.pop();
    }
    
    // Get the front element of the queue
    public int peek() {
        // Transfer elements from st1 to st2 if st2 is empty
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        // Peek at the front element of st2
        return st2.peek();
    }
    
    // Check if the queue is empty
    public boolean empty() {
        // Queue is empty if both stacks are empty
        return st1.isEmpty() && st2.isEmpty();
    }
}
