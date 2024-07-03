import java.util.*;
class countdigits{
    static int countOfDigits(int n, int count){
        if (n == 0){
            return count;
        }  
        return countOfDigits(n/10, ++count);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int result = countOfDigits(n, 0);
        System.out.println(result);

    }
}