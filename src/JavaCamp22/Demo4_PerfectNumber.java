package JavaCamp22;

public class Demo4_PerfectNumber {

	public static void main(String[] args) {
		int number = 8128;
		int total = 0;
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if(total == number) {
			System.out.println(number + " is a perfect number.");
		}else {
			System.out.println(number + " is not a perfect number.");
		}
		

	}

}
