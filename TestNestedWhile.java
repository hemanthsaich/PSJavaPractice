class TestNestedWhile{
    public static void main(String[] args){
        //Declaration and Increment
        int i = 1;
        while(i<=2){
            System.out.println("Outer: "+i);
            //Declaration and Intialization
            int j = 3;
            while(j > 0){
                System.out.println("Inner:"+j);
                j--;
            }
            i++;
        }
    }
}