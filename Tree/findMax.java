// package Tree;

// public class findMax {
    
//     static class TreeNode {
//         int val;
//         TreeNode left;
//         TreeNode right;
        
//         TreeNode(int val) {
//             this.val = val;
//         }
//     }
    
//     TreeNode root;
    

//     public findMax(TreeNode root) {
//         this.root = root;
//     }

//     public int maxTree(){
//         return maxTree(root);
//     }

//     private int maxTree(TreeNode root) {
//         if(root == null) return Integer.MIN_VALUE;

//         int lmax = maxTree(root.left);
//         int rmax = maxTree(root.right);

//         return Math.max(lmax, Math.max(rmax, root.val));
//     }

//     public boolean find(int val){
//         return find(root, val);   
//     }
    
//     private boolean find(TreeNode root, int val) {
//         if (root == null) return false;

//         if (root.val == val) return true;
        
//         return find(root.left, val) || find(root.right, val);
//     }
// }