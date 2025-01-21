package day15;

import java.util.Scanner;

public class Library {
	public static void main(String[]args) {
		Mgmt book=new Mgmt();
		boolean isWork=true;
		while(isWork) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Answer:");
		System.out.println(" 1 for add");
		System.out.println("2 for update");
		System.out.println("3 for show");
		System.out.println("0 for exit");
		int key=sc.nextInt();
		if(key==1) {
			System.out.println("Enter your id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your name");
			String name=sc.nextLine();
			System.out.println("Enter your Price");
			double price=sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Enter your author ");
			String author=sc.nextLine();
		
			book=new Mgmt(id,name,price,author);
		}
		
		else if(key==2) {
			System.out.println("Enter your id");
			int id=sc.nextInt();
			book.setId(id);
			sc.nextLine();
			System.out.println("Enter your name");
			String name=sc.nextLine();
			book.setName(name);
			System.out.println("Enter your Price");
			double price=sc.nextDouble();
			book.setPrice(price);
			sc.nextLine();
			
			System.out.println("Enter your author ");
			String author=sc.nextLine();
			book.setAuthor(author);
			
			
		}
		
		else if(key==3) {
			System.out.println(book);
			
			
		}
		
		else if(key==0) {
			isWork=false;
			System.out.println("Thank u");
			
		}
		else {
			System.out.println("Enter the correct answer");
		}
		
		
	}

}
}
