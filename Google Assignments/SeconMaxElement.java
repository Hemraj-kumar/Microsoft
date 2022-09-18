import java.util.*;
public class SeconMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int index=0;index<n;index++) arr[index]=sc.nextInt();
        sc.close();
        Arrays.sort(arr);
        System.out.println("The second Greater Elements is : "+arr[n-2]);

    }
}
