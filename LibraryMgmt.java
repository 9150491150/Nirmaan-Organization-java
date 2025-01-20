package day14;

public class LibraryMgmt {
	public static void main(String[]args) {
		Book lm = new Book(123,"Moana",1000,"Pavi");
		Book lm2=new Book();
		
		lm2.setId(07);
		lm2.setName("Moana");
		lm2.setPrice(1000.00);
		lm2.setAuthor("Pavi");
		
		System.out.println(lm);
		System.out.println(lm2);
		
		
		
		
		
		
	}

}
