class Solution {
    public int[] getConcatenation(int[] nums) {
        int[]res=new int[nums.length*2];
        for(int index=0;index<nums.length;index++) res[index+nums.length]=res[index]=nums[index];
        return res;
    }
}