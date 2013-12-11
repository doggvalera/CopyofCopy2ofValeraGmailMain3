package valera.server;

import valera.server.domain.User;
import valera.server.domain.UserRepository;
import valera.shared.ValeraService;
import valera.shared.model.UserRegistration;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ValeraServiceImpl extends RemoteServiceServlet implements ValeraService {


	@Override
	public UserRegistration getUserRegistration(String login, String name, String surname, String password) {
		UserRepository userRepositry = new UserRepository();
		User u = userRepositry.loadById(1);
		
		UserRegistration e = new UserRegistration();
		e.setLogin(login);
		e.setName(surname);
		e.setSurname(surname);
		e.setPassword(password);
		
		System.out.println(login);
		System.out.println(name);
		System.out.println(surname);
		System.out.println(password);
		System.out.println(u);
		return e;
	}	
}
