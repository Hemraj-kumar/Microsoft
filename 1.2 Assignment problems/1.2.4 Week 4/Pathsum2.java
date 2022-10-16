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
    List<List<Integer>> res=new ArrayList<>();
    private void traverse(TreeNode root,int targetSum,List<Integer> arr){
        targetSum-=root.val;
        arr.add(root.val);
        if(root.left==null && root.right==null && targetSum==0){
            res.add(new LinkedList<>(arr));
        }else{
            if(root.left!=null){
                traverse(root.left,targetSum,arr);
            }if(root.right!=null){
                traverse(root.right,targetSum,arr);
            }
        }
        arr.remove(arr.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null) return res;
        traverse(root,targetSum,new LinkedList<>());
        return res;
    }
}