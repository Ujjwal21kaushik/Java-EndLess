package queuessss;

class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;

    CircularQueue(int len) {
        arr = new int[len];
    }



    void add(int val){
        if(size == arr.length){
            System.err.println("Queue is Full");
            return;
        }

        arr[r++] = val;

        if(r == arr.length) r=0;
        size++;
    }

    int remove(){
        if(size == 0){
            System.err.println("Queue is Empty");
            return -1;
        }
        int frontValue = arr[f];
        f++;
        if(f == arr.length) f=0;
        size--;

        return frontValue;
    }

    int peek(){
        if(size == 0){
            System.err.println("Queue is Empty");
            return -1;
        }

        return arr[f];
    }

    void display(){
        if(size == 0){
            System.err.println("Queue is Empty");
            return;
        }
        if (f>=r) {
            for(int i =f; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i =0; i<r; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i =f; i<r; i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    
}
public class ImplementUsingArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.display();
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.add(60);
        System.out.println(q.remove());
        System.out.println(q.remove());
        q.add(70); 
        q.display();
    }
}
