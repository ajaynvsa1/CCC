import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = 1;
    while(true){
        int addend = in.nextInt();
        if(n+addend>100){
            n=n;
            System.out.println("You are now on square "+n);
        }
        if(n+addend<100&&addend<=12&&addend>=2){
            n=n+addend;
            if(n==54){
                n=19;
            }
            if(n==90){
                n=48;
            }
            if(n==99){
                n=77;
            }
            if(n==9){
                n=34;
            }
            if(n==40){
                n=64;
            }
            if(n==67){
                n=86;
            }
            System.out.println("You are now on square "+n);
            continue;
        }
        if(n+addend==100&&addend<=12&&addend>=2){
            System.out.println("You are now on square 100");
            System.out.println("You Win!");
            break;
        }
        if(addend==0){
            System.out.println("You Quit!");
            break;
        }
        
    }
    
    }
}
