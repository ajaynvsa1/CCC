import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int i = 1;
        int[] x = new int[n.length() / 2];
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        hmap.put('I',1);
        hmap.put('V',5);
        hmap.put('X',10);
        hmap.put('L',50);
        hmap.put('C',100);
        hmap.put('D',500);
        hmap.put('M',1000);
        while((i-1)/2 < x.length){
            if(i+2 >= n.length()){
                break;
            }
            if(hmap.get(n.charAt(i)) < hmap.get(n.charAt(i+2))){
                x[(i-1)/2] -= 1;
            }
            else{
                x[(i-1)/2] += 1;
            }
            i += 2;
        }
        x[x.length-1] = 1;
        /*while(i < x.length){
            System.out.println(x[i]);
            i++;
        }*/
        i = 0;
        while(i < n.length() - 1){
            int mult = n.charAt(i) - '0';
            //System.out.println("Mult: " + mult);
            char base = n.charAt(i + 1);
            //System.out.println("Base: " + base);
            x[i / 2] *= mult * hmap.get(base);
            //System.out.println(x[i / 2] + " + ");
            /*switch(base){
                case 'I': x[i] = mult * 1;
                          break;
                case 'V': x[i] = mult * 5;
                          break;
                case 'X': x[i] = mult * 10;
                          break;
                case 'L': x[i] = mult * 50;
                          break;
                case 'C': x[i] = mult * 100;
                          break;
                case 'D': x[i] = mult * 500;
                          break;
                case 'M': x[i] = mult * 1000;
                          break;
            }*/
            i += 2;
        }
        i = 0;
        int sum = 0;
        while(i < x.length){
            sum += x[i];
            i++;
        }
        System.out.print(sum);
    }
}
