package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Main001 {

	public static void main(String[] args) {

		Department obj = new Department(1, "Books");
		System.out.println(obj + "\n");

		Seller seller = new Seller(1, "João Silva", "joao@gmail.com", new Date(), 3000.11, obj);
		System.out.println(seller);
	}

}
