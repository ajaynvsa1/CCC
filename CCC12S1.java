public class Main {
    static int nc2(int q){
        int comb = (q*q-q)/2;
        return comb;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        int SumBodyOnceToldMe = 0;
        while(i<=n-2){
            
            SumBodyOnceToldMe += nc2(i);
            i++;
        }
        System.out.println(SumBodyOnceToldMe);
        
    }
    
    