// Last updated: 7/9/2026, 3:09:16 PM
class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> mini;

    public MinStack() {
        stack = new Stack();
        mini = new Stack();
    }

    public void push(int val) {
        stack.push(val);

        if (mini.size() > 0) {
            val = Math.min(mini.peek(), val);
        }

        mini.push(val);
    }

    public void pop() {
        stack.pop();
        mini.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mini.peek();
    }
}
