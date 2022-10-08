class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || check(root.left,root.right);
    }
    private boolean check(TreeNode left,TreeNode right){
        if(left==null || right==null) return left==right;   
        if(right.val!=left.val) return false;
        return check(left.left,right.right) && check(left.right,right.left);
    }
}