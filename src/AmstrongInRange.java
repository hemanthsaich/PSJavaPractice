import java.util.*;

public class AmstrongInRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lower number: ");
		int lower = sc.nextInt();
		
		System.out.println("Enter a higher number: ");
		int higher = sc.nextInt();
		sc.close();
		
		
		for (int i = lower; i <= higher; i++) {
			int len = order(i);
			int temp = i, digit, sum = 0;
			while(temp !=0) {
				digit = temp % 10;
				sum = sum + (int)Math.pow(digit, len);
				temp /= 10;
			}
			
			if(i == sum) {
				System.out.println(i);
			}
		}

	}
	
	static int order(int x) {
		int len = 0;
		while(x != 0) {
			len++;
			x = x/10;
		}
		return len;
	}

}
