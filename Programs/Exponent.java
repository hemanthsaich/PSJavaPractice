import java.util.*;

class Exponent{

    static int calExponent(int base, int power){
        int expo = 1;
        while (power != 0){
            expo = expo * base;
            power--;
        }
        return expo;
    }
    
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power value: ");
        int power = sc.nextInt();
        System.out.print("Enter starting  range: ");
        int sr = sc.nextInt();
        System.out.print("Enter ending range: ");
        int er = sc.nextInt();
        
        //Using Method
        //Using Loop
        for (int i = sr; i <=er;i++){
            int expo = calExponent(i, power);
            System.out.println("The Exponent of base "+i+" and power "+power+" is : "+expo);
        }

        // //Using Directly
        // int expo = 1;

        // while (power != 0){
        //     expo = expo * base;
        //     power--;
        // }

        
    }
}