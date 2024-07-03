import java.util.*;
class PerfectNum{
    static int Perfect(int num){
        int sum = 0;

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        System.out.print("Enter a starting range: ");
        int sr = sc.nextInt();
        System.out.print("Enter a ending range: ");
        int er = sc.nextInt();

        //Using direct 
        // int sum = 0;
        // for (int i = 1; i < num; i++){
        //     if (num % i == 0){
        //         sum += i;
        //     }
        // }
        
        //Using Method
        //to print in range
        for (int i=sr;i<= er;i++){
            int result = Perfect(i);
            if (i == result){
                System.out.println(i);
            }
        }
        
    
    }
}