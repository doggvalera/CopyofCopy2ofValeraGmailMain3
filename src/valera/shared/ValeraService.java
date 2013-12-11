package valera.shared;

import valera.shared.model.UserRegistration;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("valeraservice")
public interface ValeraService extends RemoteService { 

	
	UserRegistration getUserRegistration(String login, String name, String surname, String password);

}
