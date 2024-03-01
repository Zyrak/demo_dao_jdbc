package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		
		System.out.println("=== Test 1: seller findById ===");
		Seller seller = sellerDao.findById(5);		
		System.out.println(seller);
		
		System.out.println("=== Test 2: seller findByDepartment ===");
		Department dep = new Department(1, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
	}

}
