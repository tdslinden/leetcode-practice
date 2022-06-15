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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } 
        
        int counter = 0;
         
        return traverse(root, counter);
    }
    
    public int traverse(TreeNode root, int counter) {
        if (root == null) {
            return counter;
        }
        
        return Math.max(traverse(root.left, counter + 1), traverse(root.right, counter + 1));
    }
}

