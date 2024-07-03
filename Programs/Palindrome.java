import java.util.*;
class Palindrome{
    //Using Method
    static boolean checkPalindrome(int n){
        int temp = n, rem = 0, rev = 0;;
        while (temp != 0){
            rem = temp % 10;
            rev = (rev*10) + rem;
            temp = temp / 10;
        }

        if(n == rev){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number to check it is palindrome or not: ");
        System.out.print("Enter a starting range: ");
        int sr = sc.nextInt();
        System.out.print("Enter a ending range: ");
        int er = sc.nextInt();

        // int num = sc.nextInt();
        //Using direct implementation
        // int temp = num, rem = 0, rev = 0;
        // while (temp != 0){
        //     rem = temp % 10;
        //     rev = (rev*10) + rem;
        //     temp = temp / 10;
        // }

        for (int i = sr; i <= er; i++){

            boolean result = checkPalindrome(i);
            if(result){
                System.out.println(i+" is Palindrome.");
            }else{
                System.out.println(i+" is not a Palindrome.");

            }

        }


    }
}