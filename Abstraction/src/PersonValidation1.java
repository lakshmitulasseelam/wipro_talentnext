
public class PersonValidation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Please provide name and age as command line arguments.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException1("Age must be between 18 and 59.");
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Age must be an integer.");
        } catch (InvalidAgeException1 | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
	}


