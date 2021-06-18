import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.replace(":"," ");
        /*if(!s.equals("05 00")){
            System.out.println(s);
        }*/
        Scanner in2 = new Scanner(s);
        int hours = in2.nextInt();
        int mins = in2.nextInt();
        mins += 60*hours;
        int countdown = 240;
        boolean wentThru =false;
        while(countdown > 0){
            if((mins>=420&&mins<=600)||(mins>=900&&mins<=1140)){
                countdown-=1;
                wentThru = true;
            }
            else{
                countdown-=2;
            }
            //if(countdown > 0){
                mins++;
            //}    
            if(mins > 1439){
                mins = 0;
            }
        }
        if(wentThru&&!((mins>=420&&mins<=600)||(mins>=900&&mins<=1140))){ 
            mins--;
        }
        if(mins/60 < 10){
            System.out.print("0" + mins/60);
        }
        else{
            System.out.print(mins/60);
        }
        if(mins%60 < 10){
           System.out.print(":0"+(mins%60));
        }
        else{
            System.out.print(":"+(mins%60));
        }
    }
}
