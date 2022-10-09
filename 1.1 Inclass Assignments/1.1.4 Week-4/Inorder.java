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
    List<Integer>arr=new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        Inorder(root);
        return arr;
    }
    public void Inorder(TreeNode root){
        if(root!=null){
            Inorder(root.left);
            arr.add(root.val);
            Inorder(root.right);
        }
    }
}