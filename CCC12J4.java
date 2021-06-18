import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int i = 1;
        int c;
        while(i < s.length()+1){
            c = 3*i+n;
            if((int) s.charAt(i-1) -c < 65){
                System.out.print((char)((int)s.charAt(i-1) - c + 90 -64));
            }
            else{
                System.out.print((char)((int)s.charAt(i-1)-c));
            }
            i++;
        }

    }
}
