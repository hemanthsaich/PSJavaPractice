
public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234, rev = 0, digit;
		
		while (num != 0 ) {
			digit = num % 10;
			rev = (rev*10) + digit;
			num = num / 10;
			
		}
		
		System.out.println("The reverse of number "+num+" is : "+rev);

	}

}
