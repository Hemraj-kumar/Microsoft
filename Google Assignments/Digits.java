import java.util.Scanner;
public class Alldigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0) {
            int rem = n % 10;
            n /= 10;
        }
    }
}
