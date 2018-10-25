
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CountriesTextFile {
	public void readCountries() {
		try {
			FileReader f = new FileReader("countries.txt");
			BufferedReader br = new BufferedReader(f);
			String name = new String();
			System.out.println();
			while ((name = br.readLine()) != null) {
				System.out.println(name);
			}
			System.out.println();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeCountry(String country) {
		try {
			FileWriter fw = new FileWriter("countries.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter out = new PrintWriter(bw);
			out.println(country);
			
			out.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}



