package InterfaceTask;

import java.util.Scanner;

public class AnimalClass {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String s=sc.nextLine();
		Dog d=new Dog();
		d.move();
		d.speak();
		Bird b= new Bird();
		b.move();
		b.speak();
		
		System.out.println(Animal.isMammal(s));
		
		System.out.println(Animal.CATEGORY);
		
	}

}
