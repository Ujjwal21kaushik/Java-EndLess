package Tree;

import java.util.*;
import javax.management.Query;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class againImplement {
    public static void main(String[] args) {
        //         2
        //      /     \
        //     3        4
        //   /   \    /   \
        //  6    8   9     10
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(6);
        TreeNode e = new TreeNode(8);
        TreeNode f = new TreeNode(9);
        TreeNode g = new TreeNode(10);

        // Let's Connect hehehehe

        a.left = b;  a.right = c;
        b.left = d;   b.right = e;
        c.left = f;   c.right = g;

        // Function start...

        // postOrder(a);
        // System.out.println();
        // inOrder(a);
        // System.out.println();
        // preOrder(a);
        // System.out.println();

        // List<List<Integer>> list = new ArrayList();
        // dfsLevelOrder(a, 0, list);
        
        // System.out.println(list);

        // kthLevel(a , 0 , 1);

        // System.out.println(rootLevel(a,0,4));
        // findCousins(a, null , 0,6 );

        findCousinBfs(a,6);
       
    }
    private static void findCousinBfs(TreeNode root, int x) {
        if(root == null || root.val == x){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        boolean found = false;
        q.offer(root);
        while(!q.isEmpty() && !found){
            
            int size = q.size();
            
            for (int i = 0; i < size; i++) {
                
                TreeNode value = q.poll();

                if((value.left != null && value.left.val == x) || (value.right != null && value.right.val == x)){
                    found = true;
                }
                else{
                    if(value.left != null){
                        q.offer(value.left);
                    }
                    if(value.right != null){
                        q.offer(value.right);
                    }
                }
            }
        }

        while(!q.isEmpty()){
            System.out.print(q.poll().val+ " ");
        }
        
    }
    private static void postOrder(TreeNode root) {
        if(root == null) return;
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    private static void inOrder(TreeNode root) {
        if(root == null) return;
        
        postOrder(root.left);
        System.out.print(root.val+" ");
        postOrder(root.right);
    }
    private static void preOrder(TreeNode root) {
        if(root == null) return;
        
        System.out.print(root.val+" ");
        postOrder(root.left);
        postOrder(root.right);
    }
    
    private static void dfsLevelOrder(TreeNode root , int level ,  List<List<Integer>> list) {
        if(root == null) return;

        if(list.size() == level) {
            list.add(new ArrayList<Integer>());
        }
        list.get(level).add(root.val);
        
        dfsLevelOrder(root.left , level +1 , list);
        dfsLevelOrder(root.right , level +1 , list);
    }
    
    private static void kthLevel(TreeNode root , int level , int k){
        if(root == null) return;

        if(level == k) System.out.print(root.val+ " ");

        kthLevel(root.left, level+1, k);
        kthLevel(root.right, level+1, k);
    }

    private static int rootLevel(TreeNode root, int level, int k){
        if(root == null) return -1;

        if(root.val == k) return level ;

        int left = rootLevel(root.left, level+1, k);
        if(left != -1) return left;
        
        
        return rootLevel(root.right, level+1, k);
    }


static int targetLevel = -1;
static TreeNode targetParent = null;

private static void findCousins(TreeNode root, TreeNode parent, int level, int x) {
    if (root == null) return;

    // Step 1: find x
    if (root.val == x) {
        targetLevel = level;
        targetParent = parent;
        return;
    }

    // Step 2: if already found x, collect cousins
    if (targetLevel != -1) {
        if (level == targetLevel && parent != targetParent) {
            System.out.print(root.val + " ");
        } 
    }

    findCousins(root.left, root, level + 1, x);
    findCousins(root.right, root, level + 1, x);
}



}
