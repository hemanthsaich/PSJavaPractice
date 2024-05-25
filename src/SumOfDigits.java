
public class SumOfDigits {

	public static void main(String[] args) {
		int num = 1234;
		System.out.println("The sum of digits of "+num+" is : "+getSumofDigits(num));
		
	}
	
	static int getSumofDigits(int num) {
		if ( num ==0) {
			return 0;
		}
		return (num % 10) + getSumofDigits(num / 10);
	}

}
