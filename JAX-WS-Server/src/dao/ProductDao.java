package dao;
import java.util.ArrayList;
import java.util.List;

import  entites.*;
 
public class ProductDao {
	
 public Product find(){
	 
	 
	 return new Product("po1","Product - 1",100);
 }
 
	public List<Product> findAll(){
		
		
		List<Product> plist=new ArrayList<Product>();
		plist.add(new Product("po1","Product - 1",100));
		plist.add(new Product("po2","Product - 2",200));
		plist.add(new Product("po3","Product - 3",300));
		plist.add(new Product("po4","Product - 4",400));
		
		
		
		return plist;
	}
	
 
 
 
	
}
