//Write a program to swap two numbers 
import java.util.*;
class SwaptwoNums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("A value is:"+a);
        System.out.println("B value is:"+b);

        //Using temp variable
        // int temp; 
        // temp = a;
        // a = b;
        // b = temp;

        //Without using temp variable
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping");
        System.out.println("A value is:"+a);
        System.out.println("B value is:"+b);

        
        
    }
}