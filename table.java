import java.util.*;
import java.util.Random;
public class table {
    public static void main(String[] args) {
        int table;
        int fact=1;

        while (true) {
            System.out.println("enter the number: ");

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 1; i < 11; i++) {
                table = a * i;
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println(a + "*" + i + "=" + table);
            }

//            for(int i=1;i<a;i--) {
//                fact = fact * i;
//                System.out.println("factorial"+fact);
//            }
            int x;
            System.out.println("if you want to conatinue press 1 : ");
            x=sc.nextInt();
            if(x!=1){
                break;
            }



        }
    }
}