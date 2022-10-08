class Solution {
    public static int j,n;
    static int[]res=new int[j];
    static void Merge(int[]arr,int start,int mid,int end){
        int index=start,ctr=mid+1,k=0;
        while(index<=mid && ctr<=end){
            if(arr[index]<arr[ctr]){
                res[k++]=arr[index++];
            }else{
                res[k++]=arr[ctr++];
            }
        }
        if(index>mid){
            while(ctr<=end) res[k++]=arr[ctr++];
        }else{
            while(index<=mid) res[k++]=arr[index++];
        }
    }
    static int[] MergeSort(int[]arr,int start,int end){
        while(start<end){
            int mid=(start+end)/2;
            MergeSort(arr,start,mid);
            MergeSort(arr,mid+1,end);
            Merge(arr,start,mid,end);
        }
        return res;
    }
    public int[] sortArray(int[] arr) {
        int n=arr.length;
        int[]f=MergeSort(arr,0,n-1);
        return f;
    }
}