class Solution {
    static boolean Search(int[][]arr,int rowS,int colLen,int target){
        for(int index=0;index<colLen;index++){
            if(arr[rowS][index] == target){
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] arr, int target) {
        int rowLen=arr.length;
        int colLen=arr[0].length;
        for(int index=0;index<rowLen;index++){
            boolean res=Search(arr,index,colLen,target);
            if(res) return true;
        }
        return false;
    }
}