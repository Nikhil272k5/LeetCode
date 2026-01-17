/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int globalMax = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
         if(root==null)
            return 0;

        int max =  maxPath(root); 
        return Math.max(globalMax,max);
    }

    public int maxPath(TreeNode root) {
         if(root==null)
            return 0;

        int left =  maxPath(root.left); 
        int right =  maxPath(root.right);
        
        globalMax = Math.max(globalMax,Math.max(root.val, Math.max(root.val + left, Math.max(root.val + right,root.val
        +left +right))));
        
        return Math.max(root.val,Math.max(root.val+left,root.val+right)); 
    }
}