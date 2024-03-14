import java.util.Scanner;
import java.util.Random;
public class random_Int {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        while(true){
        int a = random.nextInt(6);

        System.out.println("Random Number: "+a);
        int b = random.nextInt(6);
        System.out.println("Random Number: "+b);
        int c = random.nextInt(6);
        System.out.println("Random Number: "+c);
        if(a==b && b==c && a==c){
            System.out.println("All are having same points, So match is Tai");

        }
        else if(a==b){
            System.out.println("a and b are winner");
        }
        else if(b==c){
            System.out.println("b and c are winner");
        }
        else if(a==c) {
            System.out.println("a and c are winnner");
        }

            int x = (a > b) ? (Math.max(a, c)) : (Math.max(b, c));
            if (x == a) {
                System.out.println("a is winner");
            } else if (x == b) {
                System.out.println("b is winner");
            } else if (x == c) {
                System.out.println("c is winner");
            }


        int o;

            System.out.println("if you to continue the game press 1 (one) : ");
            System.out.println("Thank You");
            o=sc.nextInt();
            if(o!=1){
                break;
            }


    }
}
}