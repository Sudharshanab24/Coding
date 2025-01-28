class MyStack {

    Queue<Integer> q1=new LinkedList<>(); 
    Queue<Integer> q2=new LinkedList<>();

    public MyStack() {
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()>1)
        q2.add(q1.poll());

        int popele=q1.poll();

        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;

        return popele;
    }
    
    public int top() {
        while(q1.size()>1)
        q2.add(q1.poll());

        int popele=q1.poll();
        q2.add(popele);

        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
        
        return popele;
    }
    
    public boolean empty() {

        if(q1.size()==0) return true;
        else return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */