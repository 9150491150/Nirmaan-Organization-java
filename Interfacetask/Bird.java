package InterfaceTask;

public class Bird implements Animal  {
	@Override
	public void speak() {
		System.out.println("The bird says: Chirp Chirp");
		

	}

	@Override
	public void move() {
		System.out.println("The birds Flies in the sky");
		
	}
	
	

}
