class Solution {
    static int Partition(int[] arr,int i,int j){
        int pivot=arr[i];
        int start=i;int end=j;
        while(start<=end-1){
            while(arr[start]<=pivot){
                start++;
                if(start==end) break;
            }
                
            while(arr[end]>pivot) end--;
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        int k=arr[i];
        arr[i]=arr[end];
        arr[end]=k;
        return end;
    }
    static int[] QuickSort(int[]arr,int start,int end){
        if(start<end){
            int loc=Partition(arr,start,end);
            QuickSort(arr,start,loc-1);
            QuickSort(arr,loc+1,end);
        }
        return arr;
    }
    public int[] sortArray(int[]arr) {
        int[] res=QuickSort(arr,0,arr.length-1);
        return res;
    }
}