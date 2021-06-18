import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        char[] x = a.toCharArray();
        int i = 1;
        ArrayList<Character> c = new ArrayList<>();
        ArrayList<Character> d = new ArrayList<>();
        ArrayList<Character> h = new ArrayList<>();
        ArrayList<Character> s = new ArrayList<>();
        int cC = 0;
        int dC = 0;
        int hC = 0;
        int sC = 0;
        System.out.println("Cards Dealt Points");
        System.out.print("Clubs ");
        while(x[i] != 'D'){
            c.add(x[i]);
            switch(x[i]){
                case 'A' ->{cC+=4;}
                case 'K' -> {cC+=3;}
                case 'Q' -> {cC+=2;}
                case 'J' -> {cC+=1;}
            }
            System.out.print(x[i]+" ");
            i++;
        }
        switch(c.size()){
            case 0 -> {cC+=3;}
            case 1 -> {cC+=2;}
            case 2 -> {cC+=1;}
        }
        System.out.println(cC);
        i++;
        System.out.print("Diamonds ");
        while(x[i] != 'H'){
            d.add(x[i]);
            switch(x[i]){
                case 'A' -> {dC+=4;}
                case 'K' -> {dC+=3;}
                case 'Q' -> {dC+=2;}
                case 'J' -> {dC+=1;}
            }
            System.out.print(x[i]+" ");
            i++;
        }
        switch(d.size()){
            case 0 -> {dC+=3;}
            case 1 -> {dC+=2;}
            case 2 -> {dC+=1;}
        }
        System.out.println(dC);
        i++;
        System.out.print("Hearts ");
        while(x[i] != 'S'){
            h.add(x[i]);
            switch(x[i]){
                case 'A' -> {hC+=4;}
                case 'K' -> {hC+=3;}
                case 'Q' -> {hC+=2;}
                case 'J' -> {hC+=1;}
            }
            System.out.print(x[i]+" ");
            i++;
        }
        switch(h.size()){
            case 0 -> {hC+=3;}
            case 1 -> {hC+=2;}
            case 2 -> {hC+=1;}
        }
        System.out.println(hC);
        i++;
        System.out.print("Spades ");
        while(i < x.length){
            s.add(x[i]);
            switch(x[i]){
                case 'A' -> {sC+=4;}
                case 'K' -> {sC+=3;}
                case 'Q' -> {sC+=2;}
                case 'J' -> {sC+=1;}
            }
            System.out.print(x[i]+" ");
            i++;
        }
        switch(s.size()){
            case 0 -> {sC+=3;}
            case 1 -> {sC+=2;}
            case 2 -> {sC+=1;}
        }
        System.out.println(sC);
        System.out.print("Total ");
        System.out.print(cC+dC+hC+sC);
    }
}
