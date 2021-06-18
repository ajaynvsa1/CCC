import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int i = 0;
        int sumA = 0;
        int sumB = 0;
        boolean found = false;
        while(i < n){
            a[i] = in.nextInt();
            i++;
        }
        i = 0;
        while(i < n){
            b[i] = in.nextInt();
            i++;
        }
        i = 0;
        int max = 0;
        while(i < n){
            sumA += a[i];
            sumB += b[i];
            if(sumA == sumB){
                found = true;
                max = i+1;
            }
            i++;
        }
        if(!found){
            System.out.print(0);
        }
        else{
            System.out.print(max);
        }
    }
}