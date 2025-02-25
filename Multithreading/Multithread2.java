package Multithreading2;

class class1 implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("class 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class class2 implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("class 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Multithread2 {
	public static void main(String[]args) {
		class1 c1=new class1();
		class2 c2=new class2();
		Thread tr1=new Thread(c1);
		Thread tr2=new Thread(c2);
		tr1.start();
		tr2.start();
	}

}
