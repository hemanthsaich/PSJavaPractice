import java.util.*;

class ReverseNum{
    static int Reverse(int n){
        int rev = 0, rem = 0;
        while( n != 0 ){
            //1. Extract the digit from RHS of given number
            rem = n % 10;
            //2. Align the extracted digit and store it for future iterations
            rev = (rev*10) + rem;
            //3. remove the align digit & carry forward the updated n value
            n = n / 10; 
            //4. Repeat the 1,2,3 until n becomes 0.
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting range: ");
        int sr = sc.nextInt();
        System.out.print("Enter a ending range: ");
        int er = sc.nextInt();

        // while( n != 0 ){
        //     //1. Extract the digit from RHS of given number
        //     rem = n % 10;
        //     //2. Align the extracted digit and store it for future iterations
        //     rev = (rev*10) + rem;
        //     //3. remove the align digit & carry forward the updated n value
        //     n = n / 10; 
        //     //4. Repeat the 1,2,3 until n becomes 0.
        // }
        
        for (int i = sr ;i <= er; i++){
            int result = Reverse(i);
            System.out.println(result);
        }
    }
}