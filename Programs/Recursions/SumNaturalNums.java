// WAP to print sum of first n natural numbers using recurion
import java.util.*;

class SumNaturalNums{
    static int dispNum(int n){        
        if(n == 1){
            return n;
        }     
        return n + dispNum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = dispNum(num);
        System.out.println("The sum of first "+num+" natural numbers is: "+res);
    }
}