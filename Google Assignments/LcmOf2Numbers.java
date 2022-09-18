import java.util.*;
public class LcmOf2Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        int res=(a>b)?a:b;
        while(true){
            if((res%a==0) && (res%b==0)){
                System.out.println("Lcm of 2 Numbers is : "+res);
            }
            res++;
        }
    }    
}
