import java.rmi.RemoteException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.rpc.ServiceException;

import org.glassfish.jersey.client.ClientConfig;

import com.parameta.dao.ServiceDAOImpl;
import com.parameta.dao.ServiceDAOImplServiceLocator;
import com.parameta.model.Empleado;



public class mainTest {

	public static void main(String[] args) {
	System.out.println("entro");
	ServiceDAOImplServiceLocator locator = new ServiceDAOImplServiceLocator();
	Empleado emp = null;
  
		try {
			ServiceDAOImpl service = locator.getServiceDAOImpl();
			
			emp = service.getEmpleado(1);
			System.out.println(emp.getNombres());
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("salio");

	}

}
