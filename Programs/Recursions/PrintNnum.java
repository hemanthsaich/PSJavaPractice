// WAP to print 1 to n numbers using recursion

import java.util.*;

class PrintNnum{
    // // called method
    // static void Printnum(int sr, int er){ //method declaration
    //     if(sr == (er+1)){ // base condition
    //         return;
    //     }
    //     System.out.print(sr+" "); // logic
    //     Printnum(sr+1, er);// recursive call

    // }
    

    // In reverse Order - method 1
    // called method
    // static void Printnum(int er){ //method declaration
    //     if(er == 0){ // base condition
    //         return;
    //     }
    //     System.out.print(er+" "); // logic
    //     Printnum(--er); // recursive call

    // }

    // In reverse Order - method 2
    static void Printnum(int sr, int er){ //method declaration
        if(sr < er){ // base condition
            return;
        }
        System.out.print(sr+" "); // logic
        Printnum(sr-1, er);// recursive call

    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ending range : ");
        int end = sc.nextInt();
        Printnum(end, 1); // method call
    }
}