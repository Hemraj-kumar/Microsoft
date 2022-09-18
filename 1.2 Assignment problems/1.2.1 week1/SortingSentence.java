class Solution {
    public String sortSentence(String s) {
        // int len=s.length();
        String[] str=s.split(" ");
        int len=str.length;
        String[] res=new String[len];
        for(int index=0;index<len;index++){
            String temp=str[index];
            int tlen=temp.length()-1;
            res[temp.charAt(tlen)-'1']=temp.substring(0,tlen);
        }
        return String.join(" ",res);
    }
}