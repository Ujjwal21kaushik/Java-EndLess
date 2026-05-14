package queuessss;


class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class MyQueue {
    Node head;
    Node tail;
    int size;

    int peek(){
        if(size==0){
            System.err.print("Queue is Empty!");
            return -1;
        }

        return head.val;
    }

    int remove(){
        if(size==0){
            System.err.print("Queue is Empty!");
            return -1;
        }
        int removeValue = head.val;
        head = head.next;
        size--;
        return removeValue;
    }
    void add(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        } 
        size++;
    }
    void display(){
        
        Node temp = head;
        if(size==0){
            System.err.print("Queue is Empty!");
        }

        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
