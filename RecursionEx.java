import java.util.*;
//Structure of a recursive method
// 1. Design the method declaration 
// // a. return type
// // b. Parameter [defined based on the logic & the values that has to be carry forwarded]
// 2. include the logic
// 3. recursive call
// 4. base condition



class RecursionEx{
    //called method
    static void HelloRecusive(int n){// method declaration
        if (n == 0){
            return;
        }
        System.out.println("Hello World"); // logic
        HelloRecusive(--n); // recursive call
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        HelloRecusive(n); // Method call
    }
}