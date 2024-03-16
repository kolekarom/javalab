import java.util.*;
public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String username = "om";
//        int pass = 123;
        String inputusername;
        int inputpass;
        String username;
        int pass;
        while (true) {
            System.out.println("enter the input user name : ");
            inputusername = sc.nextLine();
            System.out.println("Enter the input password : ");
            inputpass = sc.nextInt();
            System.out.println("sign in successfully : ");
            System.out.println("give the login username :");
            username = sc.next();
            System.out.println("give the login password :");
            pass = sc.nextInt();
            if (username  == inputusername && pass == inputpass) {
                System.out.println("login sucessfull");
                break;
            } else {
                System.out.println("Login unsucessfull");

            }
                int o;

                System.out.println("if you want to try again  press 1 (one) : ");
                System.out.println("Thank You");
                o = sc.nextInt();
                if (o != 1) {
                    break;

                }
                //}


        }
    }
}