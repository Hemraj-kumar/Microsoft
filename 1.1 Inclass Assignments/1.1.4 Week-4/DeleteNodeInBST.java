
class Solution {
    public int leafLeft(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
        }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            // else if(root.right==null && root.left==null) return null;
            root.val=leafLeft(root.right);
            root.right=deleteNode(root.right,root.val);
        }
        return root;
    }

    
}