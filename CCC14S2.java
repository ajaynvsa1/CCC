import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t = 2*n;
    int i = 0;
    String[] s = new String[t];
    while(i < t){
        s[i] = in.next();
        i++;
    }
    i = 0;
    HashMap<String, String> hmap = new HashMap<String, String>();
    while(i < n){
        hmap.put(s[i], s[i+n]);
        i++;
    }
    i = 0;
    boolean pairing = true;
    while(i < n){
        if(!((hmap.get(s[i]).equals(s[i+n])))||!((hmap.get(s[i+n]).equals(s[i])))||hmap.get(s[i]).equals(s[i])||hmap.get(s[i+n]).equals(s[i+n])){
            pairing = false;
            break;
        }
        i++;
    }
    i = 0;
    /*while(i < n){
        System.out.print(s[i] + " ");
        i++;
    }
    while(i < t){
        System.out.print(s[i] + " ");
        i++;
    }
    System.out.println();
     i = 0;*/
    /*while(i < n){
        System.out.print(hmap.get(s[i]) + " ");
        i++;
    }
    System.out.println();
    while(i < t){
        System.out.print(hmap.get(s[i]) + " ");
        i++;
    }
    System.out.println();*/
    if(pairing == false){
        System.out.print("bad");
    }
    else{
        System.out.print("good");
    }
    }
}
