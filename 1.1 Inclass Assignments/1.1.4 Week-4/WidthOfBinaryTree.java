class Pair{
    TreeNode node;
    int num;
    Pair(TreeNode _node,int _num){
        node= _node;
        num= _num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair>q=new LinkedList<>();
        int res=0;
        
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int minimal=q.peek().num;
            int first=0,last=0;
            for(int index=0;index<size;index++){
                int curr=q.peek().num-minimal;
                TreeNode node=q.peek().node;
                q.poll();
                if(index==0) first=curr;
                if(index==size-1) last=curr;
                if(node.left!=null) q.offer(new Pair(node.left,(curr*2)+1));
                if(node.right!=null) q.offer(new Pair(node.right,(curr*2)+2));
            }
            res=Math.max(res,last-first+1);
        }
        return res;
    }
}