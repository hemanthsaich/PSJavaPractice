import java.util.* ;
class Amstrong{
    static int CountOfDigits(int n){
        int count = 0;
        while (n != 0){
            n = n / 10;
            count++;
        }
        return count;
    }

    static int calExponent(int base, int power){
        int expo = 1;
        while(power != 0){         
            expo = expo * base;
            power--;
        }
        return expo;
    }

    static boolean checkAmstrong(int n){
        int power = CountOfDigits(n);
        int temp = n, sum = 0, rem;
        while (temp != 0){
            rem = temp % 10;
            sum = sum + calExponent(rem, power);
            temp /= 10;
        }

        if ( n == sum ){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        
        // //Using Directly
        // int power = CountOfDigits(n);
        // int temp = n, sum = 0, rem;
        // while (temp != 0){
        //     rem = temp % 10;
        //     sum = sum + calExponent(rem, power);
        //     temp /= 10;
        // }

        boolean result = checkAmstrong(n)

        if(result){
            System.out.println("Amstrong number");
        }else{
            System.out.println("Not a Amstrong number");
        }


    }
}