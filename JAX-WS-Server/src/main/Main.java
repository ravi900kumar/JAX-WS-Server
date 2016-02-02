package main;

import javax.xml.ws.Endpoint;

import ws.DemoImpl;
import ws.ProductWSImpl;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			
			/*Endpoint.publish("http://localhost:4141/ws/demo", new DemoImpl());
			System.out.println("working demo");
			*/
			
			Endpoint.publish("http://localhost:4242/ws/demo", new DemoImpl());
			Endpoint.publish("http://localhost:4242/ws/product", new ProductWSImpl());
			
			System.out.println("working demo");
			
			
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
