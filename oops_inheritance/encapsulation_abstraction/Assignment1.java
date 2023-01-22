package oops_inheritance.encapsulation_abstraction;

class Author {
	 String name;
	 String email;
	 char gender;

	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}
	public void getAuthor() {
		System.out.println("Author Name :"+author.name);
		System.out.println("Author mail id :"+author.email);
		System.out.println("Gender :"+author.gender);
		
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Book book1=new Book("JAVA",new Author("Sumit Bera", "sumitbera@mail.com", 'M'),560.0,200);
			System.out.println("Book: "+book1.getName());
			book1.getAuthor();
			System.out.println("Price: "+book1.getPrice());
			System.out.println("Qty In Stock: "+book1.getQtyInStock());
	}
}
