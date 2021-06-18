//package com.company;
//import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String wide = in.next();
        String clause = in.next();
        int i = 0;
        String[] x = new String[clause.length()];
        while(i < x.length){
            if(i == 0){
                x[i] = clause;
            }
            else{
                x[i] = x[i-1].substring(1,x.length) + x[i-1].charAt(0);
            }
            i++;
        }
        i = x.length;
        int j = 0;
        int counter = 0;
        boolean found = false;
        while(counter < x.length){
            while(i <= wide.length()){
                if(wide.substring(j,i).equals(x[counter])){
                    found = true;
                    break;
                }
                i++;
                j++;
            }
            if(found){
                System.out.print("yes");
                break;
            }
            i = x.length;
            j = 0;
            counter++;
        }
        if(!found){
            System.out.print("no");
        }
    }
}
