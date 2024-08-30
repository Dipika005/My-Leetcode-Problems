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
    ArrayList<Integer> arr = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        pre(root);
        return arr;

    }

    public void pre(TreeNode root) {
        if (root == null) {
            return;
        }

        pre(root.left);
        arr.add(root.val);

        pre(root.right);

    }
}