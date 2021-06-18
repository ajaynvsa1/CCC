import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] x = new int[n];
    int i = 0;
    while(i<n){
        x[i] = in.nextInt();
        i++;
    }
    Arrays.sort(x);
    int lenLo = 0;
    int lenHi = 0;
    if(n%2==1){
       lenLo=(int)(n/2)+1;
       lenHi=(int)(n/2);
    }
    else if(n%2==0){
        lenLo=n/2;
        lenHi=lenLo;
    }
    i=0;
    int[] lo = new int[lenLo];
    int[] hi = new int[lenHi];
    while(i<lenLo){
        lo[i]=x[i];
        i++;
    }
    int g = 0;
    while(g<lenHi){
        hi[g]=x[i];
        i++;
        g++;
    }
    i=0;
    if(n%2==0){
        while(i<n/2){
            System.out.print(lo[lenLo-1-i]+" ");
            if(i<lenHi){
                System.out.print(hi[i]+" ");
            }
            i++;
        }
    }
    else if(n%2==1){
        while(i<(n/2)+1){
            System.out.print(lo[lenLo-1-i]+" ");
            if(i<lenHi){
                System.out.print(hi[i]+" ");
            }
            i++;
        }
    }
    }
}
