package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.CreateDepartmentDao();
		
		
		System.out.println("=== Test 1: department findById ===");
		Department dep = depDao.findById(1);		
		System.out.println(dep);
		
		System.out.println("=== Test 3: department findAll ===");
		List<Department> list = depDao.findAll();
		list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== Test 4: department Insert ===");
		Department newDepartment = new Department(null, "test");
		depDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== Test 5: department Update ===");
		dep = depDao.findById(4);
		dep.setName("test");
		depDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("=== Test 6: department Delete ===");
		depDao.deleteById(6);
		System.out.println("Delete completed!");
		
	}

}
