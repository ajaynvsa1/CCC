import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[26];
        int[] b = new int[27];
        int i = 0;
        String x = in.nextLine();
        String y = in.nextLine();
        while(i<x.length()){
            a[(int)x.charAt(i)-97]++;
            i++;
        }
        i=0;
        while(i<y.length()){
            if(y.charAt(i)=='*'){
                b[26]++;
            }
            else{
                b[(int)(y.charAt(i))-97]++;
            }
            i++;
        }
        i=0;
        while(i<26){
            if(a[i]!=b[i]){
                if(b[26]>=Math.abs(a[i]-b[i])){
                    b[26]-=Math.abs(a[i]-b[i]);
                }
                else{
                    System.out.println("N");
                    return;
                }
            }
            i++;
        }
        System.out.println("A");
    }
}
