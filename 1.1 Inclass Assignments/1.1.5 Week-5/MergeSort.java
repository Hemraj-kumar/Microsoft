class Solution {
    int n;
    int[] res;
    void Merge(int[]arr,int start,int mid,int end){
        int index=start,ctr=mid+1,k=start;
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
       
        System.arraycopy(res,start,arr,start,end-start+1);
       

    }
    int[] MergeSort(int[]arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            MergeSort(arr,start,mid);
            MergeSort(arr,mid+1,end);
            Merge(arr,start,mid,end);
        }
        return res;
    }
    public int[] sortArray(int[] arr) {
         n=arr.length;
         res=new int[n];
        int[]f=MergeSort(arr,0,n-1);
        return f;
    }
}