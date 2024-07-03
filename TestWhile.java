class TestWhile{
    public static void main(String[] args){
        // //Declaration and Intialization
        // int i=1;
        // //Include Boolean_condition in while loop
        // while(i <=5){
        //     System.out.println(i);
        //     //Increment or Decrement
        //     i++;
        // }

        
        int i = 1;
        while(i<=3){
            System.out.println("Outer Loop: "+i);
            int j = 5;
            while(j >= 1){
                System.out.print(j+" ");
                j--;
            }
            i++;
            System.out.println();

        }
    }
}