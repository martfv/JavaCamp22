package JavaCamp22;

public class Demo3_AsalSayi {

	public static void main(String[] args) {
		int number = 0;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println(number + " is not a prime number.");
			return;
		}
		
		if (number<1) {
			System.out.println("Invalid number.");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println(number + " is a prime number.");
		}else {
			System.out.println(number + " is not a prime number.\nRemainder is: " + remainder);
		}

	}

}
