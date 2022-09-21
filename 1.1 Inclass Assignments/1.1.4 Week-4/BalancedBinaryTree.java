class Solution {
    static int height(TreeNode root){
        if(root==null) return 0;
        int leftheight=height(root.left);
        if(leftheight==-1) return -1;
        int rightheight=height(root.right);
        if(rightheight==-1) return -1;
        
        if(Math.abs(rightheight-leftheight)>1) return -1;
        return Math.max(rightheight,leftheight)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
}