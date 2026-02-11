class MinStack {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> min_s = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        s.push(val);

        if (min_s.empty() || val <= min_s.peek()){
            min_s.push(val);
        }
        else {
            min_s.push(min_s.peek());
        }
    }
    
    public void pop() {
        s.pop();
        min_s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min_s.peek();
    }
}
