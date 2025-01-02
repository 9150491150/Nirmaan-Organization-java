package day9;

import java.util.Scanner;

public class UIEx {
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the FirstNum:");
		int firstnum=sc.nextInt();
		System.out.println("Enter the SecondNum:");
		int Secondnum=sc.nextInt();
		System.out.println("Addition :"+calc.add(firstnum, Secondnum));
		System.out.println("Subtraction :"+calc.sub(firstnum, Secondnum));
		System.out.println("Multiplication :"+calc.mul(firstnum, Secondnum));
		System.out.println("Division :"+calc.div(firstnum, Secondnum));
		System.out.println("modulus :"+calc.mod(firstnum, Secondnum));

	}

}
