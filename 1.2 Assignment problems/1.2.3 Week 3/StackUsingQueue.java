class MyStack {
    private Queue<Integer> A;
    private Queue<Integer> B;
    public MyStack() {
        A=new LinkedList<>();
        B=new LinkedList<>();
    }
    
    public void push(int x) {
        B.offer(x);
        while(!A.isEmpty()){
            B.offer(A.poll());
        }
        while(!B.isEmpty()){
            A.offer(B.poll());
        }
    }
    
    public int pop() {
       return A.poll();
    }
    
    public int top() {
        return A.peek();
    }
    
    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }
}
