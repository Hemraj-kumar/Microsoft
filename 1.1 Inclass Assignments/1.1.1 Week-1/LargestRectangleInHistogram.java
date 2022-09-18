class Solution {
    public int largestRectangleArea(int[] arr) {
        int len=arr.length;
        int[] leftSmall=new int[len];int rightSmall[] =new int[len];
        Stack<Integer> stack=new Stack<>();
        for(int index=0;index<len;index++){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[index]){
                stack.pop();
            }
            if(stack.isEmpty()) leftSmall[index]=0;
            else leftSmall[index]=stack.peek()+1;
            stack.push(index);
        }
        while(!stack.isEmpty()) stack.pop();
        
        for(int index=len-1;index>=0;index--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[index]){
                stack.pop();
            }
            if(stack.isEmpty()) rightSmall[index]=len-1;
            else rightSmall[index]=stack.peek()-1;
            stack.push(index);
        }
        
        //applying formula
        int max=0;
        for(int index=0;index<len;index++){
             max=Math.max(max,arr[index]*(rightSmall[index]-leftSmall[index] + 1));
        }
        return max;
    }
}