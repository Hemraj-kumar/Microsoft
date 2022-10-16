class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left=0,sum=0,size = Integer.MAX_VALUE;
       for(int right=0;right<nums.length;right++){
           sum += nums[right];
           while(sum>=target){
               size = Math.min(size,right-left+1);
            //    System.out.println(size);
            //    System.out.println("left "+left);
               sum-=nums[left++];
            //    System.out.println("left "+left);
           }
       }
       return size==Integer.MAX_VALUE ? 0:size; 
    }
}