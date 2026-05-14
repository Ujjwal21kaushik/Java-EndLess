package Tree;

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    Node node;
    int level;
    
    Pair(Node node ,int level){
        this.node = node ;
        this.level = level;
    }
}

public class Implementation {
        //         3
        //      /     \
        //     4        2
        //   /   \    /   \
        // -1    1   6     9
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; a.right =c;
        b.left = d; b.right =e;
        c.left = f; c.right =g;

        // display(a);
        System.out.println(size(a));
        // System.out.println(sum(a));
        // System.out.println(height(a));
        // System.out.println(max(a));
        // display(a);
        // System.out.println();
        // invert(a);
        // display(a);

        // bfs(a);
        // bfslevelorder(a);

    //    kthlevel(a,0,1);

        // for (int i = 0; i < height(a); i++) {
        //     kthlevel(a, 0, i);
        //     System.out.println();
        // }

        // diameter(a);
        // System.out.println(dim);


        // List<List<Integer>> result = new ArrayList<>();
        // dfsLevelOrder(a , 0 , result);
        // System.out.println(result);
        ArrayList<Integer> ans = new ArrayList<>();
        rightView(a , 0 , ans);
        System.out.println(ans);

    }
    static int dim = Integer.MIN_VALUE;
    private static int diameter(Node root) {
        if(root == null) return 0; 

        int left = diameter(root.left);
        int right = diameter(root.right);

        dim = Math.max(dim , left+right);

        return Math.max(left, right) + 1 ;
    }

    private static void kthlevel(Node root, int level, int k) {
        if(root == null) return ;

        if(level == k) System.out.print(root.val+" ");
        kthlevel(root.left, level+1, k);
        kthlevel(root.right, level+1, k);
    }

    private static void bfslevelorder(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int curr =0;
        while(!q.isEmpty()){ 
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;

            if(level != curr){
                curr++;
                System.out.println();
            }
            System.out.print(front.node.val+ " ");

            if(node.left != null) q.add(new Pair(node.left, level+1)); 
            if(node.right != null) q.add(new Pair(  node.right, level+1));
        }

    }

    private static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+ " ");

            if(front.left != null) q.add(front.left); 
            if(front.right != null) q.add(front.right);
        }

    }

    public static void invert(Node root) {
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;  
        invert(root.left);        
        invert(root.right);        
    }


    private static int height(Node root) {
        // height = number of nodes in path
       if(root == null) return 0; //we are counting nodes


    //    if(root == null) return -1; //we  are counting edges   // height =number of edges

        return Math.max(height(root.left),height(root.right)) +1;
    }

    private static int sum(Node root) {
        if(root == null) return 0;

        int lsum = sum(root.left);
        int rsum = sum(root.right);

        return lsum + rsum + root.val;
    }

    private static int size(Node root) {
        if(root == null) return 0;

        int lc = size(root.left);
        int rc = size(root.right);

        return lc + rc +1;

    }

    private static void display(Node root) {
        if(root == null) return;

        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }

    private static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        
        int lrmax = Math.max(max(root.left),max(root.right));
        return Math.max(lrmax,  root.val);
    }

    private static void dfsLevelOrder(Node root, int level, List<List<Integer>> result) {
        if(root == null) return;

        if(result.size() == level){
            result.add(new ArrayList<>());
        }
        result.get(level).add(root.val);

        dfsLevelOrder(root.left, level+1, result);
        dfsLevelOrder(root.right, level+1, result);
        
    }

    private static void rightView(Node root, int level, ArrayList<Integer> ans) {
        if(root == null) return ;

        if(level >= ans.size()){
            ans.add(root.val);
        }else{
            ans.set(level,root.val);
        }
        rightView(root.left, level+1, ans);
        rightView(root.right, level+1, ans);
    }




}
