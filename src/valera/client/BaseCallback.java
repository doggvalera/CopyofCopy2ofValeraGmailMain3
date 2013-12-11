package valera.client;

import valera.shared.model.UserRegistration;

import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class BaseCallback<T> implements AsyncCallback<T>{

	public void onFailure(Throwable caught) {	
		
	}
}
