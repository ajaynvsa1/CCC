import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        String a = in.nextLine();
        String b = in.nextLine();
        a = a.replaceAll(" ","");
        b = b.replaceAll(" ","");
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        boolean anagrams = true;
        if(x.length == y.length){
           while(i < x.length){
               if(x[i] != y[i]){
                   anagrams = false;
                   break;
               }
               i++;
           }
           if(anagrams){
               System.out.print("Is an anagram.");
           }
           else{
               System.out.print("Is not an anagram.");
           }
        }
        else{
            System.out.print("Is not an anagram.");
        }
    }
}
