
public class PrimeRange {

	public static void main(String[] args) {
		int lower = 2, higher = 15;
		for (int i = lower; i <= higher;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	public static boolean isPrime(int num){
		// 0, 1 returns as not a prime.
		if(num < 2) {
			return false;
		}
		//checking divisors b/w 2 to n-1
		for (int i=2; i<num;i++ ) {
			if(num % i == 0) {
				return false;
			}
		}
		// if it reaches here ,number will be prime.
		return true;
	}

}
