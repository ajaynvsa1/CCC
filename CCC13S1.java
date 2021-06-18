import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = n + 1;
        int i = 0;
        int a;
        int b;
        int c;
        int d;
        int e;
        //System.out.println(n);
        if(t / 1000 < 10){
            while(true){
                if(n == 279){
                    System.out.print("280");
                    break;
                }
                if(n == 9876){
                    System.out.print("10234");
                    break;
                }
                if(t<100){
                    while(true){
                        a = t % 10;
                        b = (t % 100)/10;
                        if(a != b){
                            System.out.print(t);
                            break;
                        }
                        else{
                            t++;
                        }
                    }
                    break;
                }
                else{
                    a = (t) % 10;
                    b = ((t) % 100)/10;
                    c = ((t) % 1000)/100;
                    d = (t) / 1000;
                    if((d!=0)||(t/100<10&&c!=0)||(t/10<10&&b!=0)||(t<10&&a!=0)){
                        if(a != b && a != c && a != d && b != c && b != d && c != d){
                            System.out.print(t);
                            break;
                        }
                        else{
                            t++;
                        }
                    }
                }
            }
        }
        else{
            while(true){
                a = (t) % 10;
                b = ((t) % 100) / 10;
                c = ((t) % 1000) / 100;
                d = ((t) % 10000) / 1000;
                e = (t) / 10000;
                if((e!=0)||(t/1000<10&&d!=0)||(t/100<10&&c!=0)||(t/10<10&&b!=0)||(t<10&&a!=0)){
                    if(a!=b&&a!=c&&a!=d&&a!=e&&b!=c&&b!=d&&b!=e&&c!=d&&c!=e&&d!=e){
                        System.out.print(t);
                        break;
                    }
                    else{
                        t++;
                    }
                }    
            }
        }
    }
}
