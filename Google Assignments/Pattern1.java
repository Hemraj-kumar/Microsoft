import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();sc.close();
        for(int index=1;index<n;index++){
            for(int ctr=1;ctr<=index;ctr++){
                System.out.print(ctr);
            }
            System.out.println();
        }
    }    
}
