import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int m = in.nextInt();
    int[] x = new int[m];
    int[] y = new int[k];
    int i = 0;
    int g = 0;
    int j = 0;
    while(i<m){
        x[i]=in.nextInt();
        i++;
    }
    i=0;
    while(i<k){
        y[i]=i+1;
        i++;
    }
    i=0;
    int n = 0;
    while(g<m){
        while(i<k){
            if((i+1)%x[g]==0){
             y[i]=0;  
            }
            i++;
        }
        i=0;
        while(i<k){
            if(y[i]==0){//COMPACTING
                j=i;
                while(j<k){
                    if(j<=k-2){
                        y[j]=y[j+1];
                    }
                    j++;
                }
            }
            i++;
        }
        i=0;
        g++;
    }
    System.out.println(y[0]);
    i=1;
    while(i<k){
        if(y[i]!=y[i-1]&&y[i]!=0){
            System.out.println(y[i]);
        }
        i++;
    }
    
    }
}
