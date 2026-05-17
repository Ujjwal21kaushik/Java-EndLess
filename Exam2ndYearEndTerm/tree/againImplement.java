package Exam2ndYearEndTerm.tree;

import java.util.LinkedList;
import java.util.Queue;

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

        TreeNode aa = new TreeNode(2);
        TreeNode bb = new TreeNode(3);
        TreeNode cc = new TreeNode(4);
        TreeNode dd = new TreeNode(6);
        TreeNode ee = new TreeNode(8);
        TreeNode ff = new TreeNode(9);
        TreeNode gg = new TreeNode(10);

        // Let's Connect hehehehe

        a.left = b;  a.right = c;
        b.left = d;   b.right = e;
        c.left = f;   c.right = g;

        aa.left = bb;  aa.right = cc;
        bb.left = dd;   bb.right = ee;
        cc.left = ff;   cc.right = gg;

        // Function start...

        Postorder(a);
        Inorder(a);
        Preorder(a);
        // System.out.println(height(a));
        // System.out.println(maxNode(a));
        // System.out.println(size(a));
        
        // findCousinBfs(a, 6);
       
        System.out.println(isSameTree(a, aa));
    }







    private static void Postorder(TreeNode node) {
        //***********Code below this*****************



        //*********Above this**********************
    }

    private static void Inorder(TreeNode node) {
        //***********Code below this*****************



        //*********Above this**********************
    }

    private static void Preorder(TreeNode node) {
        //***********Code below this*****************
     
        //*********Above this**********************
    }

    private static int size(TreeNode node){
        // ***********Code below this*****************
        
       return 0;

        // *********Above this**********************        
    }

    private static int height(TreeNode root){
    //     //***********Code below this*****************
            return 0;


    //     //*********Above this**********************        
    }
    

    private static int maxNode(TreeNode node){
        //***********Code below this*****************
        return 0;

        

        //*********Above this**********************        
    }


    private static void findCousinBfs(TreeNode root, int x) {
        //***********Code below this*****************
        if(root == null || root.val == x) return;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean found =false;

        while(!q.isEmpty() && !found){
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode rev = q.poll();

                if((rev.left != null && rev.left.val == x) || (rev.right != null && rev.right.val == x)){
                    found = true;
                }
                else{
                    if(rev.left !=null){
                        q.offer(rev.left);
                    }
                    if(rev.right !=null){
                        q.offer(rev.right);
                    }
                }
            }
        }
        while(!q.isEmpty()){
            System.out.print(q.poll().val + " ");
        }

        //*********Above this**********************  
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

















}

    // private static List<Integer> Pre-order(TreeNode node) {
       


    //     //*********Above this**********************
    // }