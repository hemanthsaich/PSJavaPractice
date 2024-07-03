import java.util.*;
class Exponential{

    static int calExponentVal(int base, int power){
        if (power == 0){
            return 1;
        }
        return base * calExponentVal(base, power-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int base = sc.nextInt();
        System.out.println("Enter power number: ");
        int power = sc.nextInt();

        int result = calExponentVal(base, power);
        System.out.println(result);

    }
}