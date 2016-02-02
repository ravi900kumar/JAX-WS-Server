package ws;
import javax.jws.*;

@WebService(endpointInterface="ws.Demo")
public class DemoImpl implements Demo{
	@Override
	@WebMethod
	public String helloworld() {
		
		return "Hello world";
	}

	@Override
	@WebMethod
	public String hi(String fullName) {
	
		return " Hello"+fullName ;
	}
	

}
