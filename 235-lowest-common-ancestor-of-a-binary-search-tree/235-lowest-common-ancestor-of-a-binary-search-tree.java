/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return root;
        }
        
        int mid = root.val;
        
        if (p.val < mid && q.val > mid) {
            return root;
        }
        
        if (p.val == mid) {
            return p;
        }
        
        if (q.val == mid) {
            return q;
        }
        
        if (p.val < mid && q.val < mid) {
            return lowestCommonAncestor(root.left, p, q);
        }
        
        if (p.val > mid && q.val > mid) {
            return lowestCommonAncestor(root.right, p, q);
        }
        
        return root;
    }
}