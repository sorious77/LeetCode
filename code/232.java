class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        while(!output.isEmpty()) {
            input.push(output.pop());
        }
        
        input.push(x);
        
        while(!input.isEmpty()) {
            output.push(input.pop());
        }
    }
    
    public int pop() {
        return output.pop();
    }
    
    public int peek() {
        return output.peek();
    }
    
    public boolean empty() {
        return output.isEmpty();
    }
}
