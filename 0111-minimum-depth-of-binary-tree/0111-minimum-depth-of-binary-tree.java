/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int fun(TreeNode root){
        if(root==null)return 100000;
        if(root.left==null&&root.right==null)return 1 ;
        int l=fun(root.left);
        int r=fun(root.right);
        return  1+Math.min(l,r);
    }
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        return fun(root);
    }
}