class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put('}','{');
        map.put(']','[');
        map.put(')','(');
        for(int index=0;index<s.length();index++){
            char ch=s.charAt(index);
            if(map.containsKey(ch)){
                char top=stack.isEmpty()?' ':stack.pop();
                if(top!=map.get(ch)){
                    return false;
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}