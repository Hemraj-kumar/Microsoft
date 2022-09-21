class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    void invert(TreeNode root){
        if(root==null) return;
        invert(root.left);invert(root.right);
        TreeNode temp;
        temp=root.left;
        root.left=root.right;
        root.right=temp;
    } 
}