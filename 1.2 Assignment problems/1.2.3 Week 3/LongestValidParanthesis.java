class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int max=0;
        char[] str=s.toCharArray();
        for(int index=0;index<str.length;index++){
            if(str[index]=='('){
                stack.push(index);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(index);
                }else{
                    int len=index-stack.peek();
                    max=Math.max(len,max);
                }
            }
        }
        return max;
    }
}