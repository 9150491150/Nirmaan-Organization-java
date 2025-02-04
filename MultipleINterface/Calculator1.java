package MultipleInterface;

public interface Calculator1 extends Calculator2 {
	void add(int a,int b);
	void sub(int a,int b);
	
	static void display() {
		System.out.println("Calculator");
	}
	default void Calculator() {
		System.out.println("Default");
	}

}
