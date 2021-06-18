import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int w = in.nextInt();
    int x = in.nextInt();
    int y = in.nextInt();
    int z = in.nextInt();
    int counter = 0;
    while(true){
        w--;
        x++;
        counter++;
        if(35-x==0){
            w+=30;
            x=0;
        }
        if(w==0){
            break;
        }
        w--;
        y++;
        counter++;
        if(100-y==0){
            w+=60;
            y=0;
        }
        if(w==0){
            break;
        }
        w--;
        z++;
        counter++;
        if(10-z==0){
            w+=9;
            z=0;
        }
        if(w==0){
            break;
        }
    }
    System.out.println("Martha plays " + counter + " times before going broke.");
    
    }
}
