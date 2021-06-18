import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] out = new String[n];
    int i = 0;
    String a = null;
    String b = null;
    String c = null;
    //System.out.println(n);
    while(i<n){
        a=in.next();
        b=in.next();
        c=in.next();
        if(i!=1){
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/
        }
        if(fixPresent(a,b)||fixPresent(b,c)||fixPresent(a,c)){
            out[i]="No";
        }
        else{
            out[i]="Yes";
        }
        i++;
        
    }
    i=0;
    while(i<n){
        System.out.println(out[i]);
        i++;
    }
    
    }
    public static boolean fixPresent(String x, String y){
        int i = 0;
        if(x.length()>=y.length()){
            while(i<y.length()){
                if(y.charAt(i)!=x.charAt(i)){
                    break;
                }
                i++;
            }
            if(i==y.length()){
                return true;
            }
            else{
                i=0;
                while(i<y.length()){
                    if(y.charAt(y.length()-1-i)!=x.charAt(x.length()-1-i)){
                        break;
                    }
                    i++;
                }
                if(i==y.length()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            while(i<x.length()){
                if(x.charAt(i)!=y.charAt(i)){
                    break;
                }
                i++;
            }
            if(i==x.length()){
                return true;
            }
            else{
                i=0;
                while(i<x.length()){
                    if(x.charAt(x.length()-1-i)!=y.charAt(y.length()-1-i)){
                        break;
                    }
                    i++;
                }
                if(i==x.length()){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
    }
    
}
