import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int counter = 0;
    int time = in.nextInt();
    int chores = in.nextInt();
    int[] timeChores = new int[chores];
    int i = 0;
    while(i < chores){
        timeChores[i] = in.nextInt();
        //System.out.println(timeChores[i]);
        i++;
    }
    i = 0;
    Arrays.sort(timeChores);
    while(i < chores){
        if(time - timeChores[i] >= 0){
            time -= timeChores[i];
            counter++;
        }
        else{
            break;
        }
        i++;
    }
    System.out.print(counter);
    }
}
