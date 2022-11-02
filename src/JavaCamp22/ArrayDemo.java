package JavaCamp22;

public class ArrayDemo {

	public static void main(String[] args) {	
		
		String[] students = new String[3];
		students[0] = "Ahmet";
		students[1] = "Mehmet";
		students[2] = "Ayse";
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("---------------------");
		
		for (String student : students) {
			System.out.println(student);
		}
	}

}
