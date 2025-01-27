package School;
import java.util.Scanner;
public class StdUI {
	public static void main(String[]args) {
		Student stud=new Student();
		while(true) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("1 for add");
			System.out.println("2 for update");
			System.out.println("3 for show");
			System.out.println(" 0 for exit");
			int key=sc.nextInt();
			if(key==1) {
				System.out.println("Enter your id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter your name");
				String name=sc.nextLine();
				System.out.println("Enter your rollno");
				int rollno=sc.nextInt();
				sc.nextLine();

				System.out.println("Enter your phno ");
				long phno=sc.nextLong();
				sc.nextLine();

				stud=new Student(id,name,rollno,phno);
				
				}
			else if(key==2) {
				System.out.println("1 for modify id:");
				System.out.println("2 for modify name:");
				System.out.println("3 for modify rollno:");
				System.out.println("4 for modify phno:");
				
				int keys=sc.nextInt();
				if(keys==1) {
					System.out.println("Enter the id");
					int id=sc.nextInt();
					stud.setId(id);
					
				}
				else if(keys==2) {
					System.out.println("Enter the name");
					String name=sc.nextLine();
					stud.setName(name);
				}
				else if(keys==3) {
					System.out.println("Enter the rollno");
					int id=sc.nextInt();
					stud.setRollno(id);
				}
				else if(keys==4) {
					System.out.println("Enter the phno") ;
					long phno=sc.nextLong();
					stud.setPhno(phno);
				}
				else {
					System.out.println("Enter the crt input");
				}
			}
			else if(key==3) {
				System.out.println(stud);
				
			}
			else if(key==0) {
				System.out.println("Thank u");
			}
			else {
				System.out.println("Enter the crt answer");
			}
			
				
			
				
				
			}

			

			
			
		}

}

