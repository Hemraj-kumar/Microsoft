class Solution {
    int res=Integer.MIN_VALUE;
    private int maxPath(TreeNode root){
        if(root == null) return 0;
        int left=maxPath(root.left);
        int right=maxPath(root.right);
        
        int ms=Math.max(Math.max(left,right)+root.val,root.val);
        int ms2=Math.max(left+right+root.val,ms);
        res=Math.max(ms2,res);
        return ms;
    }
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        maxPath(root);
        return res;
    }
}