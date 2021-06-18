//package com.company;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        String raw = in.nextLine();
        raw = raw.replaceAll("[^a-z|A-Z]","");
        //System.out.println(key);
        //System.out.println(raw);
        int n;
        if(raw.length()%key.length()==0){
            n = raw.length()/key.length();
        }
        else{
            n = (raw.length()/key.length()) + 1;
        }
        char[][] spread = new char[n][key.length()];
        int i = 0;
        int j = 0;
        int c = 0;
        while(i < n){
            while(c < raw.length()&&j < key.length()){
                spread[i][j] = raw.charAt(c);
                c++;
                j++;
            }
            j = 0;
            i++;
        }
        i=0;
        j=0;
        c = 0;
        while(i < n){
            while(j < key.length() && c < raw.length()){
                int x = key.charAt(j) - 65;
                int temp = ((int)spread[i][j])+x;
                if(temp <= 90){
                    spread[i][j] = (char)(temp);
                }
                else{
                    spread[i][j] = (char)(temp-26);
                }
                System.out.print(spread[i][j]);
                c++;
                j++;
            }
            j = 0;
            i++;
        }
        
    }
}
