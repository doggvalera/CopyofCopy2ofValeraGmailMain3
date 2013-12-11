package valera.shared;

import valera.shared.model.UserRegistration;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ValeraServiceAsync {
	void getUserRegistration(String login, String name, String surname, String password, AsyncCallback<UserRegistration> cllback);
}
