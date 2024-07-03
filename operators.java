class operators{
    public static void main(String[]args){
        System.out.println("Arthnetic");
        System.out.println(5+3);
        System.out.println(+9);
        System.out.println("==============");
        System.out.println(70-9);
        System.out.println(-9);
        System.out.println("==============");
        System.out.println(5*8);
        // System.out.println(*9)
        // Control Time Error : Illegeal start of expression
        System.out.println("==============");
        System.out.println(4/2);
        System.out.println(4%2);
        System.out.println(11/3);
        System.out.println(11%3);

        System.out.println("==============");
        System.out.println("Comaprision Operators");
        System.out.println(40<80); //True
        System.out.println(40>80); //False
        System.out.println(40<=80); //True
        System.out.println(40>=80); //False
        System.out.println(40==80); //False
        System.out.println(40!=80); //True
        //Logical Not(!)
        //Syntax : !(boolean_condition)
        System.out.println(!(true)); //False
        System.out.println((5>3 || 10<4)); //True
        System.out.println(!(5>3 || 10<4)); //False
        System.out.println((82>72&&36<56&&10<20)); //True
        System.out.println(!(82>72&&36<56&&10<20)); //False

        System.out.println("==============");
        System.out.println("Assignment operators:");
        // It helps to store value specified on RHS to the named memory allocated at the LHS.
        // Assignment + Arithmetic => Compound Statement (+=, -=, *=, /=, %=)
        //Compound statements: These can be used only when the variables are used operations on RHS is same as the variable used to store on LHS.
        //Example 1:
        int a=10, b=20;
        int sum=0;
        sum += a+b; //(sum = sum+a+b ;)
        System.out.println(sum);

        //Example 2:
        int x = 25;
        int product=5;
        product *= x; //(product = product*x ;)

        //Example 3:
        int s=35;
        int val;
        // val -= s; //Error occurs bcoz , local variables need to be intialized before utilize.
        //Tasks
        float x1= 12.5f, y1= 10f;
        float z1 = 35.5f;
        z1 -= x1 + y1;
        System.out.println(z1);
        System.out.println("==============");
        System.out.println("Unary operators:");
        //They requires only one operand to perform operation.
        // +  =>  Syntax : +value
        System.out.println(+9);
        // -  =>  Syntax : -value
        System.out.println(-9);

        System.out.println("==============");
        System.out.println("Increment");
        //Increment: helps to increment the value in a variable by one time.
        //Increment is of two types 
        // 1.Pre-Increment (Increment -> Substitute -> utilize)ISU
        // Syntax: ++var_name
        int i = 10, prei;
        prei = ++i;
        System.out.println(prei);
        
        // 2.Post-Increment (utilize -> Increment -> Substitute)UIS
        // Syntax: var_name++
        int posti;
        posti = i++;
        System.out.println(i);
        System.out.println(posti);
        // Example: {need to work on it}
        
        



    }
}