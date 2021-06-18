import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> x = new ArrayList<>(n);
        //System.out.print(x.size());
        int i = 0;
        int c = 0;
        while(c < n){
            int add = in.nextInt();
            if(add != 0){
                x.add(add);
                i++;
            }
            else{
                i--;
                x.remove(i);
            }
            c++;
        }
        i = 0;
        int sum = 0;
        if(!x.isEmpty()){
            while(i < x.size()){
                sum += x.get(i);
                i++;
            }
            System.out.print(sum);
        }
        else{
            System.out.print(0);
        }
    }
}
