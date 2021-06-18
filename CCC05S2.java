import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limA = in.nextInt();
        int limB = in.nextInt();
        int relA;
        int relB;
        int totA = 0;
        int totB = 0;
        while(true){
            relA = in.nextInt();
            relB = in.nextInt(); 
            if(relA == 0 && relB == 0){
                break;
            }
            if(totA + relA > limA){
                totA = limA;
            }
            if(totB + relB > limB){
                totB = limB;
            }
            if(totA + relA < 0){
                totA = 0;
            }
            if(totB + relB < 0){
                totB = 0;
            }
            if(totA + relA <= limA && totA + relA >= 0){
                totA += relA;
            }
            if(totB + relB <= limB && totB + relB >= 0){
                totB += relB;
            }
            System.out.println(totA + " " + totB);
        }
    }
}