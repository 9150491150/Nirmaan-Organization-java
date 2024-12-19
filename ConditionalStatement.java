package day3;

import java.util.Scanner;

public class ConditionalStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the number:");
		int mark = sc.nextInt();
		if ((mark >= 35) && (mark <= 100)) {

			if (mark >= 90) {
				System.out.println("Grade A");
			} else if (mark >= 80) {
				System.out.println("Grade B");
			} else {
				System.out.println("Grade C");
			}

		} else if(mark>100) {
			System.out.println("invalid");
		}
		
		else {
			System.out.println("Fail");

		}

	}
}*/
		System.out.println("Enter your choice:");
		System.out.println("1 for add ");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		System.out.println("5 for mod");
		int key=sc.nextInt();
		switch (key) {
		case 1:{
		System.out.println("Enter First number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second number:");
		int num2=sc.nextInt();
		
		System.out.println("Addition:"+(num1+num2));
		break;
		
		}
		case 2:{
			System.out.println("Enter First number:");
			int num1=sc.nextInt();
			System.out.println("Enter Second number:");
			int num2=sc.nextInt();
			
			System.out.println("sub:"+(num1-num2));
			break;
			
		}
		case 3:{
			System.out.println("Enter First number:");
			int num1=sc.nextInt();
			System.out.println("Enter Second number:");
			int num2=sc.nextInt();
			
			System.out.println("mul:"+(num1*num2));
			break;
			
		}
		case 4:{
			System.out.println("Enter First number:");
			int num1=sc.nextInt();
			System.out.println("Enter Second number:");
			int num2=sc.nextInt();
			
			System.out.println("div:"+(num1/num2));
			break;
			
			
		}
		case 5:{
			System.out.println("Enter First number:");
			int num1=sc.nextInt();
			System.out.println("Enter Second number:");
			int num2=sc.nextInt();
			
			System.out.println("div:"+(num1%num2));
			break;
			
			
		}
		
		
	}
	}
}


