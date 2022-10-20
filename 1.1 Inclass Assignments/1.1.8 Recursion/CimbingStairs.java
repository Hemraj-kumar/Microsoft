class Solution {
    public int climbStairs(int n) {
        int[] arr=new int[n+2];
        arr[1]=1;
        arr[2]=2;
        for(int index=3;index<=n;index++){
            arr[index]=arr[index-1]+arr[index-2];
        }
        return arr[n];
    }
}