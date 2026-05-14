package queuessss;
import java.util.*;

public class traverseInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);q.add(20);q.add(30);q.add(40);

        for(int i=0; i<q.size(); i++){
            int store = q.remove();
            System.out.print(store +" ");
            q.add(store);
        }
    }

}
