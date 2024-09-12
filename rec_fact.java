import java.util.Scanner;
public class rec_fact {
    public static int calcfactorial(int n){
        if( n==0 || n==1){
            return 1;
        }
        int fact_n = calcfactorial(n-1);
        int factorial = n * fact_n;
        return factorial;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = calcfactorial(n);
        System.out.println(ans);

    }
}
