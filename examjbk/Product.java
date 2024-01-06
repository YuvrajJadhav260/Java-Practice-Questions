package examjbk;
/*
 "Creating a Product Inventory Class with Constructors"

You are tasked with creating a Java class to represent products in an inventory system. The class should have constructors to initialize product objects with basic information. 
You'll then create instances of this class and demonstrate how to use constructors effectively.
Requirements: Create a Java class named Product with the following attributes:
productId (int): An integer to store the product's ID.
productName (String): A string to store the name of the product.
price (double): A double to store the price of the product.
quantityInStock (int): An integer to store the quantity of the product in stock.
Implement a parameterized constructor in the Product class that takes arguments to initialize the attributes mentioned above.
Implement a default constructor in the Product class that initializes the attributes with default values (e.g., productId = 0, productName = "", price = 0.0, quantityInStock = 0).
Create at least two objects of the Product class using both the default constructor and the parameterized constructor.
Demonstrate how to update the quantity of products in stock and print the product information (attributes) after each update.
 */
public class Product {
	int productId;
	String productName;
	double price;
	int quantityInStock ;
	public Product(int i, String string, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public Product() {
		int productId=0;
		String productName="";
		double price=0.0;
		int quantityInStock=0 ;
	}
	public Product(int productId,String productName,double price,int quantityInStock) {
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantityInStock=quantityInStock ;
	}
	
	public static void main(String[] args) {
		//default constructor
		Product p=new Product();
		System.out.println("By using default constructor:");
		System.out.println("productId:"+p.productId);
		System.out.println("productName:"+p.productName);
		System.out.println("price:"+p.price);
		System.out.println("quantityInStock:"+p.quantityInStock);
		
		//parameterised Constructor
		System.out.println("********************************************************");
		Product p1=new Product(123,"Toy",50.5,10);
		System.out.println("By using Parameterised constructor:");
		System.out.println("productId:"+p1.productId);
		System.out.println("productName:"+p1.productName);
		System.out.println("price:"+p1.price);
		System.out.println("quantityInStock:"+p1.quantityInStock);
		
		System.out.println("********************************************************");
		Product p2=new Product(111,"Milk",55.5,20);
		System.out.println("By using Parameterised constructor:");
		System.out.println("productId:"+p2.productId);
		System.out.println("productName:"+p2.productName);
		System.out.println("price:"+p2.price);
		System.out.println("quantityInStock:"+p2.quantityInStock);
		
		
	}
}