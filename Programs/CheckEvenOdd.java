import java.util.Scanner;
class CheckEvenOdd{

    static boolean evenOdd(int n){
        if(n%2== 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range: ");
        int sr = sc.nextInt();
        System.out.print("Enter end range: ");
        int er = sc.nextInt();

        if (sr > er){
            System.out.println("Invalid range.");
        }
        else{
            for (int i = sr ; i <= er ; i++ ){
            boolean flag = evenOdd(i);
            if(flag){
                System.out.print(i+" ");
            }
        }
        
        }
        

        // //Check Directly
        // if (n % 2 == 0){
        //     System.out.println(n+" is a even.");
        // }else{
        //     System.out.println(n+" is odd.");
        // }

        // Check Using Method
        // boolean flag = evenOdd(n);
        // if (flag == true){
        //     System.out.println(n+" is a even.");
        // }else{
        //     System.out.println(n+" is odd.");
        // }


    }
}