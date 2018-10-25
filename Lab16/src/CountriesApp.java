
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountriesApp {
	public static void main(String arg[]) {
		CountriesTextFile countriesTextFile = new CountriesTextFile();

		int answer;
		do {
			Scanner input = new Scanner(System.in);

			System.out.println("1 - See the list of countries");
			System.out.println("2 - Add a country");
			System.out.println("3 - Exit");

			System.out.print("\nPlease enter menu number : ");
			answer = input.nextInt();

			switch (answer) {
			case 1:
				countriesTextFile.readCountries();
				break;
			case 2:
				input = new Scanner(System.in);
				System.out.print("Enter country : ");
				String country = input.nextLine();
				if (validateName(country)) {
					countriesTextFile.writeCountry(country);
				}
				else{
					System.out.println("Invalid Country Name!");
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Command!");
			}

		} while (answer > 0 && answer < 4);

		System.out.println("\n\ngood bye!");
	}

	public static boolean validateName(String country) {
		String regex = "[A-Z][a-z]*";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(country);

		return matcher.matches();
	}
}



