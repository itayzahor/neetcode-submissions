class MinStack {
    private Stack<Integer> min;
    private Stack<Integer> stack;
    public MinStack() {
        min = new Stack<>();
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(min.isEmpty() || val <= min.peek()) {min.push(val);}
    }
    
    public void pop() {
        if (stack.isEmpty()) {return;}
        int x = stack.pop();
        if(x == min.peek()) {min.pop();}
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
