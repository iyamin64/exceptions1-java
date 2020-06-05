package application1;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class construtor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		//product.name = sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Price: ");
		//product.price = sc.nextDouble();
		double price = sc.nextDouble();
		// ex. sobrecarga
//		System.out.print("Quantity in stock: ");
//		//product.quantity = sc.nextInt();
//		int quantity = sc.nextInt();

		//Product product = new Product(name, price, quantity); // obriga a entrar com os dados
		Product product = new Product(name, price); // obriga a entrar com os dados + sobrecarga
		
		//Product.name = "Computer"; // reclama
		product.setName("Computer"); // correto
		System.out.println("Update name:" + product.getName());
		
		product.setPrice(1200.00); 
		System.out.println("Update price:"+ product.getPrice());
		
		System.out.println("Quantity:" + product.getQuantity());
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		
		product.removeProducts(quantity);
		System.out.println();
		System.out.println("Updated data: " + product);
		sc.close();
	}

}
