class Solution {
    static int binarySearch(int[]arr,int low,int high,int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) low=mid+1;
            if(arr[mid]>target) high=mid-1;
        }
        return low;
    }
    public int searchInsert(int[] arr, int target) {
        int low=0,high=arr.length-1;
        int res=binarySearch(arr,low,high,target);
        return res;
    }
}