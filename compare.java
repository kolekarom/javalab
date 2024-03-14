import java.util.Random;
import java.util.Scanner;
public class compare {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x;
    x=(a>b)?(a>c?a:c):(b>c?b:c);
    System.out.println("the greater number is :"+x); 

    Random rand = new Random();
        
        int randomNumber = rand.nextInt(7); // Generates a random integer from 0 to 7
        System.out.println("Random Number: " + randomNumber);

    } 
    
}
