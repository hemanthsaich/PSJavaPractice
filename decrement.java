
//Decrement: helps to decrement the value in a variable by one time.
//Decrement is of two types 
// 1.Pre-Decrement (Decrement -> Substitute -> utilize)DSU
// Syntax: --var_name
// 2.Post-Decrement (utilize -> Decrement -> Substitute)UDS
// Syntax: var_name--

public class decrement {
    public static void main(String[] args) {
        int j =0;
        j = j++ - --j + ++j - j--;
        System.out.println(j);
        
    }
}
