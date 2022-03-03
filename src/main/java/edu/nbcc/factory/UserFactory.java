package edu.nbcc.factory;

public class UserFactory /*throws Exception*/ {
	public static User getInstance(UserType userType) {
		switch(userType) {
			case ADMIN:
				return new Admin();
			case CUSTOMER:
				return new Customer();
			default:
				return new Customer();
				//throw new Exception("Invalid UserType");
		}
	}
}
