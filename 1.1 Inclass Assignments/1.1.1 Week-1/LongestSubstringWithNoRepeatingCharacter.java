class Solution {
    public int lengthOfLongestSubstring(String str) {
    //Brute Force approach
    
    //     int len=str.length();int op=0;
    //     for(int index=0;index<len;index++){
    //         boolean[] count=new boolean[256];
    //         for(int ctr=index;ctr<len;ctr++){
    //             if(count[str.charAt(ctr)] == true){
    //                 break;
    //             }else{
    //                 op=Math.max(op,ctr-index+1);
    //                 count[str.charAt(ctr)]=true;
    //             }                    
    //         }
    //         count[str.charAt(index)]=true;
    //     }
    //     return op;
        Set<Character> set=new HashSet<Character>();
        int start=0,max=0;
        for(int index=0;index<str.length();){
            if(!set.contains(str.charAt(index))){
                set.add(str.charAt(index));
                index++;
                max=Math.max(max,set.size());
            }else{
                set.remove(str.charAt(start));
                start++;
            }
        }
        return max;
    }
}