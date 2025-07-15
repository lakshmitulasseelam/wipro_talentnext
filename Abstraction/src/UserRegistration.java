
public class UserRegistration {
   public void registerUser(String username, String userCountry) throws InvalidCountryException {
	   if(!userCountry.equalsIgnoreCase("India")) {
		   throw new InvalidCountryException("User Outside India cannot be registered");
	   } else {
		   System.out.println("User registration done successfully");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  UserRegistration ur = new UserRegistration();
		  try {
			  ur.registerUser("Mickey","US" );
		  } catch (InvalidCountryException e) {
			  System.out.println(e.getMessage());
		  }

	}

}
