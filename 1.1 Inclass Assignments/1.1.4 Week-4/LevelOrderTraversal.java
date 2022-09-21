class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> curr=new LinkedList<TreeNode>();
        List<List<Integer>> res=new LinkedList<List<Integer>>();
        if(root == null) return res;
        curr.offer(root);
        while(!curr.isEmpty()){
            int size=curr.size();
            List<Integer> sub=new ArrayList<Integer>();
            for(int index=0;index<size;index++){
                if(curr.peek().left!=null) curr.offer(curr.peek().left);
                if(curr.peek().right!=null) curr.offer(curr.peek().right);
                sub.add(curr.poll().val);
            }
            res.add(sub);
        }
        return res;
    }
}