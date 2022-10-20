class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
        if(str.charAt(0)=='-')
            return false;
        
        StringBuilder s=new StringBuilder(str);
        s.reverse();
        StringBuilder k=new StringBuilder(str);
        
        if(s.toString().equals(k.toString()))
            return true;
        else
            return false;
                
    }
}