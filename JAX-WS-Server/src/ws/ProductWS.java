package ws;

import javax.jws.*;

import entites.*;
import java.util.*;


@WebService
public interface ProductWS {
	
	@WebMethod
	public Product find();
	
	@WebMethod
	public List<Product>  findAll();
	
	

}
