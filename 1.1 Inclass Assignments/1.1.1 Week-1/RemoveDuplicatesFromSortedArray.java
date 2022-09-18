class Solution {
    public int removeDuplicates(int[] nums) {
        int first=0,second=1;
        while(second<nums.length){
            if(nums[first] == nums[second]){
                second++;
            }else{
                first++;
                nums[first]=nums[second];
                second++;
            }
        }
        return first+1;
    }
}