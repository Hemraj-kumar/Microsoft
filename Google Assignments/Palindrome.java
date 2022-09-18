import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        int len=str.length();
        boolean flag=true;
        for(int index=0;index<str.length();index++){
            if(str.charAt(index) == str.charAt(len-index-1)){
                flag=true;
            }
        }
        if(flag) System.out.println("is Palindrome");
        else System.out.println("not Palindrome");
    }
}
