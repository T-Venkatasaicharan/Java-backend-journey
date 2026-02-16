package com.pract.first;
class D2Darray{
	D2Darray(){
		String[][] cars = new String[2][2];
		cars[0][0] = "swift";
		cars[0][1] = "bmw";
		cars[1][0] = "audi";
		cars[1][1] = "ranger";
		for(int i = 0;i < cars.length;i++) {
			System.out.println();
			for(int j = 0;j < cars[i].length;j++) {
				System.out.print(cars[i][j] + " ");
				
			}
		}
		System.out.println();
				
	}
}
public class ArraysHow {
	public static void main(String[] args) {
		D2Darray a = new D2Darray();
		//Arrays are used to store the multiple values in a single variable
		//same data type values
		String[] cars = {"BMW","TESLA","SWIFT"};
		String[] bikes = new String[3];
		bikes[0] = "Scooty";
		bikes[1] = "race bike";
		bikes[2] = "motercycle";
		//bikes[3] = "cycle";
		System.out.println(bikes[2]);
		for(int i = 0;i < cars.length;i++) {
			System.out.println(cars[i] +" " + (i+1));
			
		}
	}
	

}
