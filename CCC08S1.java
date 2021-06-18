import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> m = new ArrayList<String>();
        ArrayList<Integer> n = new ArrayList<Integer>();
        int i = 0;
        String city;
        int temp;
        int minTemp = 2147483647;
        int minTempPos = 0;
        while(in.hasNext()){
            city = in.next();
            temp = in.nextInt();
            m.add(i,city);
            n.add(i,temp);
            if(n.get(i) < minTemp){
                minTemp = n.get(i);
                minTempPos = i;
            }
            i++;
        }
        String minCity = m.get(minTempPos);
        System.out.print(minCity);
        
    }
}
