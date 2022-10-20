import java.util.*;

public class Alldigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        Map<Character,Integer> map=new HashMap<>();
        for(int index=0;index<str.length();index++){
            map.put(str.charAt(index),map.getOrDefault(str.charAt(index),0)+1);
        }
        for(Map.Entry<Character,Integer> l:map.entrySet()){
            char ch=l.getKey();
            int j=l.getValue();
            System.out.println(ch+" "+j);
        }
    }
}
