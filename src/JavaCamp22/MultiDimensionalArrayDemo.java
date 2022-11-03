package JavaCamp22;

public class MultiDimensionalArrayDemo {
	public static void main(String[] args) {
		String[][] cities = new String[3][3];
		
		cities[0][0] = "Istanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Izmit";
		cities[1][0] = "Ankara";
		cities[1][1] = "Sivas";
		cities[1][2] = "Konya";
		cities[2][0] = "Antalya";
		cities[2][1] = "Mugla";
		cities[2][2] = "Manisa";
		
		for (int i = 0; i <=2; i++) {
			System.out.println("----------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(cities[i][j]);
				
			}
			
		}
		 
	}

}
