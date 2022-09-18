import java.util.*;
public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0,max=0;sc.close();
        int[] arr=new int[n];
        for(int index=0;index<n;index++) arr[index]=sc.nextInt();
        //mean
        for(int index=0;index<n;index++) sum+=arr[index];
        System.out.println(sum/n);
        //median
        Arrays.sort(arr);System.out.println(arr[n/2]);
        //mode
        int[] count=new int[127];
        for(int index=0;index<n;index++){
            count[arr[index]]++;
        }
        for(int index=0;index<127;index++){
            if(count[index]>max) max=count[index];
        }
        System.out.println(max);
    }
}
