//Increment: helps to increment the value in a variable by one time.
//Increment is of two types 
// 1.Pre-Increment (Increment -> Substitute -> utilize)ISU
// Syntax: ++var_name
// 2.Post-Increment (utilize -> Increment -> Substitute)UIS
// Syntax: var_name++

public class increment {
    public static void main(String[]args){
        int a = 5,b = 15, sum = 53;
        sum += ++a + b++;
        System.out.println(sum);
        int prod = 1;
        b+=1;
        a = sum;
        prod = b*a;
        System.out.println(prod);

        int i = 11;
        i = i++ + ++i;
        System.out.println(i);

        

        

    }
}
