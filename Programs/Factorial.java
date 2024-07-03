import java.util.*;
class Factorial{

    static int calFactorial(int n){

        // int fact = 1;
        // while(n != 1){
        //     fact = fact * n;
        //     n--;
        // }
        // return fact;

        if (n == 0){
            return;
        }
        return n * calFactorial(n-1);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a value: ");
        // int n = sc.nextInt();
        System.out.print("Enter starting range: ");
        int sr = sc.nextInt();
        System.out.print("Enter ending range: ");
        int er = sc.nextInt();


        // int fact = 1;
        // //Using While loop
        // while(n != 1){
        //     fact = fact * n;
        //     n--;
        // }
        
        //Using for loop
        // for ( int i=n; i>1;i--){
        //     fact = fact * i;
        // }
        
        for (int i = sr; i<= er; i++){
            int res = calFactorial(i);
            System.out.println("Factorial of "+i+" is: "+res);

        }

    }
}