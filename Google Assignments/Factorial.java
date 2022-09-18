import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),fact=1;
        sc.close();
        for(int index=1;index<=n;index++){
            fact=fact*index;
        }
        System.out.println(fact);
    }    
}
