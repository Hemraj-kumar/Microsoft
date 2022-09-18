import java.util.*;
public class GcdOf2Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),res=0;
        sc.close();
        for(int index=1;index<=a && index<=b;index++){
            if(a%index==0 && b%index==0){
                res=index;
            }
        }
        System.out.println(res);
    }
}
