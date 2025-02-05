package InterfaceTask;
import java.util.Scanner;
public interface Animal {
	String CATEGORY=" living Being";
	
	
	
	static boolean isMammal(String s) {
		if((s.equalsIgnoreCase("Dog"))||(s.equalsIgnoreCase("cat"))||(s.equalsIgnoreCase("Human"))) {
			return true;
			}else {
				return false;
				
			}
	}
	default void speak() {
		System.out.println("Animal is making sound");
		
	}
	void move(); 
		
	
	
	
	
	
	

}
