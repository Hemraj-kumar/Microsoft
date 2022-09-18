class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int index=0;index<nums.length;index++){
            if(map.containsKey(target-nums[index])){
                arr[0]=map.get(target-nums[index]);
                arr[1]=index;
                return arr;
            }else{
                map.put(nums[index],index);
            }
        }
        return arr;
    }
}