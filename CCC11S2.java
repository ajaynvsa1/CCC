import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] a = new String[n];
    String[] q = new String[n];
    int i=0;
    while(i<n){
        a[i]=in.next();
        i++;
    }
    i = 0;
    while(i<n){
        q[i]=in.next();
        i++;
    }
    i=0;
    int counter = 0;
    while(i<n){
        if(a[i].equals(q[i])){
            counter++;
        }
        i++;
    }
    System.out.println(counter);
    }
}
