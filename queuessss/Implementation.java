package queuessss;

public class Implementation {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q.remove());
        System.out.println(q.peek());
        q.display();
    }   
}
