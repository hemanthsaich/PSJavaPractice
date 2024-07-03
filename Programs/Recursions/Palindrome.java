import java.util.*;

class Palindrome{
    
    static boolean ReverseNum(int sum , int n, int temp){
        if(n == 0){
            return sum == temp;
        }
        sum = (sum * 10) + (n % 10);
        return ReverseNum(sum, n/10, temp);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        boolean result = ReverseNum(0,n, n);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}