package day15;

public class Mgmt {
	private int id;
	private String name;
	private double price;
	private String author;
	
	public Mgmt(int id,String name,double price,String author) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.author=author;
		
		
	}
	public Mgmt() {
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String toString() {
		return "Book id:"+id+"Book name:"+name+"Book price:"+price+"Book author:"+author;

}
}
