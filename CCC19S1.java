import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    char[] c = s.toCharArray();
    int w = 1;
    int x = 2;
    int y = 3;
    int z = 4;
    int temp = 0;
    int i = 0;
    while(i<c.length){
        if(c[i]=='H'){
            temp=w;
            w=y;
            y=temp;
            temp=x;
            x=z;
            z=temp;
        }
        else if(c[i]=='V'){
            temp=w;
            w=x;
            x=temp;
            temp=y;
            y=z;
            z=temp;
        }
        i++;
    }
    System.out.println(w+" "+x);
    System.out.print(y+" "+z);
    }
}