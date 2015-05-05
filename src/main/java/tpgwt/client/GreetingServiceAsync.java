package tpgwt.client;

import java.util.List;

import tpgwt.shared.Person;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;
	void deletePerson(int id, AsyncCallback<Void> callback)
			throws IllegalArgumentException;
	void createPerson(String nom, String prenom, String genre, String mail, String date, String profil, AsyncCallback<Void> callback)
			throws IllegalArgumentException;
	void createPerson(String text, String text2,
			AsyncCallback<Person> asyncCallback);
	void personneBase(AsyncCallback<List<Person>> callback);
}
