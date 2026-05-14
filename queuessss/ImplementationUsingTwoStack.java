package queuessss;

import java.util.Stack;

class MyStackQueue {

    Stack<Integer> st;
    Stack<Integer> helper;

    public MyStackQueue() {
        st = new Stack<>();
        helper = new Stack<>();
        
    }
    
    // public void push(int x) {
    //     st.push(x);
    // }
    
    // public int pop() {
    //    while(st.size()>1){
    //     helper.push(st.pop());
    //    }
    //    int front = st.pop();
    //    while(helper.size()>0){
    //     st.push(helper.pop());
    //    }
    //    return front;
    // }
    
    // public int peek() {
    //     while(st.size()>1){
    //     helper.push(st.pop());
    //    }
    //    int front = st.peek();
    //    while(helper.size()>0){
    //     st.push(helper.pop());
    //    }
    //    return front;
    // }
        // public void push(int x) {
    //     st.push(x);
    // }
    // *-*-*-**********-*--*-** Approch 2 ****-*-**-*-*-*-*-*-***********
    public void push(int x) {
        while(!st.empty()){
            helper.push(st.pop());
        }
        st.push(x);
        while(!helper.empty()){
            st.push(helper.pop());
        }

    }
    public int pop() {
       
       return st.pop();
    }
    
    public int peek() {
        
       return st.peek();
    }
    public boolean empty() {
        return (st.size()==0 && helper.size()==0);
    }
}
public class ImplementationUsingTwoStack {
    
    public static void main(String[] args) {
        MyStackQueue q = new MyStackQueue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
    }

}
