package queuessss;

import java.util.LinkedList;
import java.util.Queue;

public class newFunctions {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(20); q.add(30); q.add(40);
        add(q,100,2);
        peek(q,2);
        remove(q,1);
    }

    public static void add(Queue<Integer> q ,int ele , int idx) {
       
        int n = q.size();
        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        q.add(ele);
        for(int i=0; i<n-idx; i++){
            q.add(q.remove());
        }

        System.out.println(q);
        
    }
    
    public static void peek(Queue<Integer> q, int idx) {
      
        int n = q.size();
        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());

        for(int i=0; i<n-idx; i++){
            q.add(q.remove());
        }   
    }
    
    public static void remove(Queue<Integer> q, int idx) {

        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        System.out.println(q.remove());

        for(int i=0; i<q.size()-idx; i++){
            q.add(q.remove());
        }  
        System.out.println(q); 
    }




}
