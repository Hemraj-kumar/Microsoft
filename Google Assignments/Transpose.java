import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int[][]arr=new int[r][c];
        for(int index=0;index<r;index++){
            for(int ctr=0;ctr<c;ctr++){
                arr[index][ctr]=sc.nextInt();
            }
        }
        for(int index=0;index<c;index++){
            for(int ctr=0;ctr<r;ctr++){
                System.out.print(arr[ctr][index]+" ");
            }
            System.out.println();
        }
    }
}
