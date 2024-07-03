// WAP to print the fibonacci series based on the given input number
import java.util.*;


class Fibonacci{
    static void CalFibonacci(int n){
    int n1 = 0, n2 = 1;
    while(n > 0){
            System.out.print(n1+" ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            n--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        // int n1 = 0, n2 = 1;

        //Using for loop 
        // for (int i= 1; i <= n; i++){
        //     System.out.print(n1+" ");
        //     int sum = n1 + n2;
        //     n1 = n2;
        //     n2 = sum;
        // }

        //Using While loop
        // while(n > 0){
        //     System.out.print(n1+" ");
        //     int sum = n1 + n2;
        //     n1 = n2;
        //     n2 = sum;
        //     n--;
        // }

        CalFibonacci(n);

    }
}