
public class PersonValidation {
     public void registerUser(String username, String userCountry) throws InvalidCountryException {
    	 if (!userCountry.equalsIgnoreCase("India")) {
    		 throw new InvalidCountryException("User outside India cannot be reg");
    	 } else {
    		 System.out.println("User registration done sucessfully");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserRegistration ur = new UserRegistration();
        try {
            ur.registerUser("Mickey", "US");   
            // ur.registerUser("Mini", "India"); 
        } catch (InvalidCountryException e) {
            System.out.println(e.getMessage());
        }
    }

	

}
