import java.util.*;
import java.util.Scanner;

class employe {
    public int age;
    public float salary;
    public String name;
}
class programmer extends employe{
    public void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age: ");
        age=sc.nextInt();
        System.out.println("enter salary: ");
        salary=sc.nextFloat();
        System.out.println("enter name of the employe: ");
        name=sc.next();
        System.out.println("-----------------------------------------------------------------------");
    }
    public void putdata() {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("age of the employe: " + age + "\npercentage: " + salary + "\nname: " + name);

    }
}
    class man extends employe {
        public void getdata() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter age: ");
            age = sc.nextInt();
            System.out.println("enter salary: ");
            salary = sc.nextFloat();
            System.out.println("enter name of the employe: ");
            name = sc.next();
        }

        public void putdata() {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("age of the employe: " + age + "\npercentage: " + salary + "\nname: " + name);

        }


        public static void main(String[] args) {
            programmer p = new programmer();
            man p1 = new man();
            p.getdata();
            p1.getdata();
            p.putdata();

            p1.putdata();
            ;

        }


}
