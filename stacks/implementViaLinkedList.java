package stacks;
class Node{
    Node next;
    int val;

    Node(int val){
        this.val = val;
    }
}
class Mystack{
    Node head;
    int size;

    int peek()throws Exception{
        if(head==null){
            throw new Exception("Satck is  Overflow!");
        } 
        return head.val;
    }
    int pop()throws Exception{
        if(head==null){
            throw new Exception("Satck is  Underflow!");
        } 
       int x = head.val;
       head = head.next;
       size--;
       return x;
    }
    void push(int ele){
        Node temp = new Node(ele);
        if(size == 0 ){
            head = temp;
        }else{
            temp.next = head;
            head =temp;
        }
        size++;
    }
    int size(){
        return size;
    }
    void display(){
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class implementViaLinkedList{
    public static void main(String[] args)throws Exception {
        Mystack st = new Mystack();
        st.peek();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display();
        System.out.println(st.peek());
        

    }
}