import java.util.*;

class ReverseNum{
    static int Reverse(int sum , int n){
        if(n == 0){
            return sum;
        }
        sum = (sum * 10) + (n % 10);
        return Reverse(sum, n/10);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int result = Reverse(0,n);
        System.out.println(result);
    }
}