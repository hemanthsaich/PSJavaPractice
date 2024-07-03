
public class PrimeNums {

	
	static void checkPrime(int n) {
		int count = 0;
		// 0,1 are not prime number, so less than 2 will be not prime
		if (n < 2) {
			System.out.println(n+ " is not a prime number.");
		}
	
		for(int i = 1; i <= n; i++) {
			if(n%i==0) {
				count += 1;
			}
		}
		// if count of divisors is greater than 2 then its not a prime.
		if (count>2) {
			System.out.println(n+ " is not a prime number.");
		}else {
			System.out.println(n+" is a prime number.");
		}

        
	}

}
