package Multithreading;


class class1 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("class 1");
			 
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				
				}
		
	}
}
class class2 extends Thread{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("class 2");
			try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			System.out.println(e);
		}
			
		}
	}
}

public class Multithread {
	public static void main(String[]args) {
		class1 c1=new class1();
		class2 c2=new class2();
		c1.start();
		c2.start();
		
	}
	
	

}
