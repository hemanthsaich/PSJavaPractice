
public class CheckAmstromg {

	public static void main (String[]args) {
		int num = 407, len;
		len = order(num);
		if (amstrong(num, len)) {
			System.out.println("Amstrong Number");
		}else {
			System.out.println("Not Amstrong.");
		}
		
	}
	
	static int order(int x) {
		int len=0;
		while(x != 0) {
			len++;
			x = x / 10;
		}
		return len;
	}
	
	static boolean amstrong(int num, int len) {
		int temp = num, digit, sum = 0;
		while(temp != 0) {
			digit = temp % 10;
			sum = sum +(int)Math.pow(digit, len);
			temp = temp / 10;
		}
		
		if(num == sum) {
			return true;
		}else {
			return false;
		}
	}
}
