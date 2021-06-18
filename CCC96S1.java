import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    //System.out.println(n);
    int[] x = new int[n];
    int i = 0;
    while(i < n){
        x[i] = in.nextInt();
        //System.out.println(x[i]);
        i++;
    }
    i = 0;
    int g = 1;
    double sum = 0;
    ArrayList<Integer> factors = new ArrayList<Integer>();
    while(i < n){
        while(g <= ((x[i])/2)){
            if(x[i] % g == 0){
                factors.add(g);
            }
            g++;
        }
        for(Integer d : factors)
        sum += d;
        if(sum < x[i]){
            System.out.println(x[i] + " is a deficient number.");
            //System.out.print("d");
        }
        else if(sum == x[i]){
            System.out.println(x[i] + " is a perfect number.");
            //System.out.print("p");
        }
        else{
            System.out.println(x[i] + " is an abundant number.");
            //System.out.print("a");
        }
        factors.clear();
        g = 1;
        sum = 0;
        i++;
    }
    }
}
