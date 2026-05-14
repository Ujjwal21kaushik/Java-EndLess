package stacks;

import java.util.Stack;

public class addrem{
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack();
        Stack<Integer> st2 = new Stack();

        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);
        st1.push(60);
        // pushAtBottom(st1,100);
        rev(st1);
        System.out.println(st1);
        // peek At Any index
        // int idx =2;
        // while(st1.size()>idx){
        //     st2.push(st1.pop());
        // }
        // System.out.println(st1.peek());
        // while(st2.size()>0){
        //     st1.push(st2.pop());
        // }
        
        // remove At Any Index
        // int idx =2;
        // while(st1.size()>idx+1){
        //     st2.push(st1.pop());
        // }
        // st1.pop();
        // while(st2.size()>0){
        //     st1.push(st2.pop());
        // }
        // System.out.println(st1);

        // Add At Any index
        // int ele=100;
        // int idx=2;
        // while(st1.size()>idx){
        //     st2.push(st1.pop());
        // }
        // st1.push(ele);
        // while(st2.size()>0){
        //     st1.push(st2.pop());
        // }
        // System.out.println(st1);
    }

    static void pushAtBottom(Stack<Integer> st1,int ele){
        if(st1.size()==0){
            st1.push(ele);
            return;
        }
        int top = st1.pop();
        pushAtBottom(st1,ele);
        st1.push(top);
    }


    static void rev(Stack<Integer> st1){
        if(st1.size()<=1) return;
        int top = st1.pop();
        rev(st1);
        pushAtBottom(st1, top);
    }

}