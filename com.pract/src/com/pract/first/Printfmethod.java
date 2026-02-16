package com.pract.first;

public class Printfmethod {
	public static void main(String[] args) {
//printf() = an optional method to control, format, and display text to the console window
		// two arguments = format string + (object/variable/value)
		// % [flags] [precision] [width] [conversion-character]
		//System.out.printf("%d This is a string ",123);
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Sai";
		int myInt = 50;
		double myDouble = 10000;
		//System.out.printf("%b",myBoolean);
		//System.out.printf("%c",myChar);
		//System.out.printf("%s",myString);
		//System.out.printf("%d",myInt);
		//System.out.printf("%f",myDouble);
		//[width]
		//minimum number of characters to be written as output
		//System.out.printf("Hello %5s", myString);
		//[Precision
		//sets number of digits of precision when outputting floating-point values
		//System.out.printf("You have money of %.2f",myDouble);
		//You have money of 10000.00
		//[flags] -adds an effect to output based on the flag added to format specifier
		//- : left-justify + :output a plus (+) or minus (-) sign for a numeric value
		//0 : numeric values are zero-padded
		//, : comma grouping separator if number > 1000
		//System.out.printf("This is number %+f",myDouble);
		//This is number +10000.000000
		System.out.printf("This is number %,f",myDouble);
		//This is number 10,000.000000
		}
}
