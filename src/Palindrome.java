
public class Palindrome {

	public static void main(String[] args) {
		int num = 121, temp, rem, rev = 0;
		temp = num ;
		
		while( temp != 0) {
			rem = temp % 10;
			rev = (rev*10)+rem;
			temp = temp /10;
		}
		
		if (num == rev) {
			System.out.println("Palindrome.");
		}else {
			System.out.println("Not a palindrome.");
		}
		

	}

}
