import java.io.*;
import java.util.Scanner;

class Product {
	String name;
	String p_code;
	int price;
	public Product() {
		this(" ", " ", 0);
	}
	public Product(String initName, String initPcode, int initPrice) {
		name = initName;
		p_code = initPcode;
		price = initPrice;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of Products:");
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Product Name, proid, price:");

		Product pro = new Product();
		Product min = new Product(" ", " ", 100);
		
		for (int i = 0; i < n; i ++) {
			pro.name = in.next();
			pro.p_code = in.next();
			pro.price = in.nextInt();

			if (min.price > pro.price) {
				min.name = pro.name;
				min.p_code = pro.p_code;
				min.price = pro.price;
			}
		}
		System.out.println("name, proid of the lowest price:");
		System.out.println(min.name + " " + min.p_code);
		in.close();
	}
}