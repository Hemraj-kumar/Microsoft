import java.util.*;
public class Pattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        for(int index=n;index>=1;index--){
            for(int ctr=index;ctr>=1;ctr--){
                System.out.print(ctr);
            }
            System.out.println();
        }
    }    
}
