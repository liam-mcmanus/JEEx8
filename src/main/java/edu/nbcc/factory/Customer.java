package edu.nbcc.factory;

/**
 * 
 * @author Liam McManus
 *
 */
public class Customer implements User {

	@Override
	public String getEntitlements() {
		return "Customer";
	}
}
