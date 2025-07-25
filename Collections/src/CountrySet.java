import java.util.HashSet;
public class CountrySet {
	HashSet<String> H1 = new HashSet<>();

   
    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

  
    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CountrySet obj = new CountrySet();
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Canada");

        System.out.println("HashSet: " + obj.H1);
        System.out.println("Get 'India': " + obj.getCountry("India"));
        System.out.println("Get 'Japan': " + obj.getCountry("Japan")); // Should return null
    }

}
