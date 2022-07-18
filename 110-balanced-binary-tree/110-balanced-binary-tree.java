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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        // want to compare the left and right subtree
        int diff = Math.abs(checkHeight(root.left) - checkHeight(root.right));
        return isBalanced(root.left) && isBalanced(root.right) && diff <= 1;
        
    }
    
    public int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        return Math.max(checkHeight(root.left), checkHeight(root.right)) + 1;
    }
}