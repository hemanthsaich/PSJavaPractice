// WAP to print sum of first n natural numbers using recurion
import java.util.*;

class Factorial{
    static int fact(int n){        
        if(n < 0){
            return 0;
        }else if(n == 0 || n == 1){
            return 1;
        }   
        return n *  fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int res = fact(num);
        System.out.println("The factorial of "+num+" is: "+res);
    }
}