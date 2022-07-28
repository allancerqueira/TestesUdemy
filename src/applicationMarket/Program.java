package applicationMarket;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.println("Enter product data: ");
		
		System.out.print("name: ");
		String name = sc.next();
		
		System.out.print("price :");
		double price = sc.nextDouble();
		
		System.out.print("quantity :");
		int quantity = sc.nextInt();
		
	
		
		Product product = new Product(name, quantity, price);
		
		System.out.println(product);
		
		
		product.setPrice(1000);
		product.setName("tv de plasma");
		product.setQuantity(0);
		System.out.println("novo tabela de protudo tabelado");
		
		
		
		System.out.println(product);
		
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: " + product);
	
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	}

}
