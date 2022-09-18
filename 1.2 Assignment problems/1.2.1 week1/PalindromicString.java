class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int fin=0;
        char[] str=s.toCharArray();
        int len=str.length;
        for(int index=0;index<len;index++){
            int left=index,right=index;
            while((left>=0 && right<len) && str[left] == str[right]){
                if((right-left+1)>fin){
                    res=s.substring(left,right+1);
                    fin=right-left+1;                
                }
                left--;right++;
            }
            left=index;right=index+1;
            while((left>=0 && right<len) && str[left] == str[right]){
                if((right-left+1)>fin){
                    res=s.substring(left,right+1);
                    fin=right-left+1;
                }
                left--;right++;
            }
        }
        return res;
    }
}