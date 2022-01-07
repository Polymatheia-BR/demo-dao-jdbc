package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		Seller seller = new Seller(1, "Victor", "vffvmode@gmail.com", sdf.parse("17/03/2002"), 2000.00, obj);
		System.out.println(seller);
	}

}
