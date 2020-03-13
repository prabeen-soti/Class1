import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<String> countryList = new Vector<String>();
		countryList.add("Nepal");
		countryList.add("China");
		countryList.add("USA");
		countryList.add("Japan");
		
		Vector<String> countryList1 = new Vector<String>();
		countryList1.add("Nepal");
		countryList1.addElement("China");
		for(String country : countryList1) {
			System.out.println(country);
		}
		
	}

}
