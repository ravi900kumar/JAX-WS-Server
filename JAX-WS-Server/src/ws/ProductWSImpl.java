package ws;
import java.util.List;

import entites.*; 

import javax.jws.*;
import dao.*;
@WebService(endpointInterface="ws.ProductWS")
public class ProductWSImpl implements ProductWS{

	private ProductDao productDao =new ProductDao();
	
	@Override
	@WebMethod
	public Product find() {
		
		return this.productDao.find() ;
	}

	@Override
	@WebMethod
	public List<Product> findAll() {
		
		return this.productDao.findAll() ;
	}

}
