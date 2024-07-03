//Variables : named memory locations where "Single valued data" are stored.

//Held in 3 steps:
//1. Declaration: it defines the type of value to be stored into a variable.
//Ex: int a;, float b;, String s;,...
//2. Initialization: it is the process of assigning/storing a value into a declared variable by using assignment operator[=].
//Ex: a = 10, b = 3.9, s = "Hello",...
//3. Utilization: Using the value that are stored.
//Ex: System.out.println(a);

//Variables are of 2 types:
//1. Local Variables: The variables that are declared within the block of code(method/constructor/for loop).
//2. Instance Variables: The variables that are declared outside the block of code.

public class Variables{
    //Sample method 1
    void m1(){
        
        //Initialization
        int a;
        //Declaration 
        //Note: It is compulsory to intializing a declared local variables before intialization
        a =10;
        System.out.println(a);

    }
    public static void main(String[] args){
        //Creating an  reference address  of Variables class.
        Variables v = new Variables();
        v.m1();

    }
}