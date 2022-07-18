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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        checkHeight(root);
        return balanced;
    }
    
    public int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int left = checkHeight(root.left) + 1;
        int right = checkHeight(root.right) + 1;
        
        if (Math.abs(left - right) > 1 && balanced) {
            balanced = false;
        }
        
        return Math.max(left, right);
    }
}