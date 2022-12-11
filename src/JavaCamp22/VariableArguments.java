package JavaCamp22;

public class VariableArguments {

	public static void main(String[] args) {
		int result = add(5,3,1,10);
		System.out.println(result);

	}
	
	public static int add(int... sayilar) {
		int total = 0;
		for (int number : sayilar) {
			total += number;
		}
		return total;
	}
}
