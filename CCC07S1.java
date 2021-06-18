import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] y = new int[n];
        int[] m = new int[n];
        int[] d = new int[n];
        int i = 0;
        while(i < n){
            y[i] = in.nextInt();
            m[i] = in.nextInt();
            d[i] = in.nextInt();
            /*System.out.print(y[i] + " ");
            System.out.print(m[i] + " ");
            System.out.println(d[i]);*/
            i++;
        }
        i = 0;
        while(i < n){
            if(y[i]<=1989){
                if(y[i]!=1989){
                    System.out.println("Yes");
                }
                else if(m[i]<2&&y[i]==1989){
                    
                    System.out.println("Yes");
                }
                else if(m[i] == 2 && d[i]<=27){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
            else{
                System.out.println("No");
            }
            i++;
        }
    }
}
