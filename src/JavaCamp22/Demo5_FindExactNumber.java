package JavaCamp22;

public class Demo5_FindExactNumber {

	public static void main(String[] args) {
		int[] numbers = new int[]{1, 4, 3, 5, 10};
		int requested = 2;
		boolean exist = false;
		
		for (int number : numbers) {
			if(number == requested) {
				exist = true;
				break;
				}
			}
		
		if (exist) {
			System.out.println(requested + " is in the array.");
		}else {
			System.out.println(requested + " is not in the array.");
		}

	}

}
